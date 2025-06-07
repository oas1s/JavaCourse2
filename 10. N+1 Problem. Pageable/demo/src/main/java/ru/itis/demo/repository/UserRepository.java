package ru.itis.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itis.demo.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT u FROM User u JOIN u.pets p")
    List<User> getUsersWithPetAndToyName();

    Page<User> findAll(Pageable pageable);

    @Override
    @EntityGraph(attributePaths = {"pets"})
    List<User> findAll();
}
