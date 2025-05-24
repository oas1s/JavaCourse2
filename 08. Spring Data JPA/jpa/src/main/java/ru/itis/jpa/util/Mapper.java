package ru.itis.jpa.util;


import ru.itis.jpa.dto.CocktailResponseDto;
import ru.itis.jpa.entity.Cocktail;

import java.util.List;

public class Mapper {

    public static List<Cocktail> getCocktails(CocktailResponseDto c){
        return c.getDrinks().stream().map( it -> {
            return Cocktail.builder().name(it.getStrDrink())
                    .glass(it.getStrGlass())
                    .alcoholic(it.getStrAlcoholic())
                    .picUrl(it.getStrDrinkThumb())
                    .ingredients(it.getStrIngredient1()+it.getStrIngredient2()+it.getStrIngredient3()+it.getStrIngredient4())
                    .category(it.getStrCategory())
                    .instructions(it.getStrInstructions()).build();
        }).toList();
    }
}
