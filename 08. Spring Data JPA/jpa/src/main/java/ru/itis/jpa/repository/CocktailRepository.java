package ru.itis.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.jpa.entity.Cocktail;

@Repository
public interface CocktailRepository
        extends JpaRepository<Cocktail,Long> {
}
