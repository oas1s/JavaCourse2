package ru.itis.jpa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import ru.itis.jpa.dto.CocktailResponseDto;
import ru.itis.jpa.entity.Cocktail;
import ru.itis.jpa.repository.CocktailRepository;
import ru.itis.jpa.util.Mapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StartUpRunner implements ApplicationRunner {

    private final WebClient webClient;
    private final CocktailRepository cocktailRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Cocktail> cocktailList = cocktailRepository.findAll();
        if (!cocktailList.isEmpty()){
            return;
        }
        CocktailResponseDto cocktailResponseDto = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search.php")
                        .queryParam("f", "a")
                        .build())
                .retrieve()
                .bodyToMono(CocktailResponseDto.class)
                .block();
        List<Cocktail> cocktails = Mapper.getCocktails(cocktailResponseDto);
        cocktailRepository.saveAll(cocktails);
    }
}
