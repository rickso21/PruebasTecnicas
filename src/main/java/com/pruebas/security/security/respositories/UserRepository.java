package com.pruebas.security.security.respositories;

import java.util.Optional;

import com.pruebas.security.security.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Luis
 */
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUserName(String userName);
    boolean existsByUserName(String userName);
    
}
