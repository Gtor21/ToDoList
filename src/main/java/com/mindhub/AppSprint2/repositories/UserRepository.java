package com.mindhub.AppSprint2.repositories;

import com.mindhub.AppSprint2.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findById(Long id);
    boolean existsById(Long id);
    long countBy();

}
