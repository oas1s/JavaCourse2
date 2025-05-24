package ru.itis.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CocktailDto {
    private String name;

    private String category;

    private String alcoholic;

    private String glass;

    private String instructions;

    private String picUrl;

    private String ingredients;
}
