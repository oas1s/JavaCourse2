package ru.itis.jpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CocktailResponseDto {

    private List<CocktailResponse> drinks;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CocktailResponse{
        private String strDrink;

        private String strCategory;

        private String strAlcoholic;

        private String strGlass;

        private String strInstructions;

        private String strDrinkThumb;

        private String strIngredient1;
        private String strIngredient2;
        private String strIngredient3;
        private String strIngredient4;
    }
}


