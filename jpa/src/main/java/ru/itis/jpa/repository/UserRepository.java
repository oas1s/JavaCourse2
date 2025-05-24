package ru.itis.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itis.jpa.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(nativeQuery = true, value = "select * from my_users where id =:userId")
    List<User> findByUserID(Long userId);


    @Query("FROM User u WHERE u.name = :name")
    User findByName(@Param("name") String name);

    List<User> findAllBySurname(String surname);

}
