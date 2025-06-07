package ru.itis.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.demo.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long> {
}
