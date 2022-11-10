package com.pruebas.security.security.respositories;

import java.util.Optional;

import com.pruebas.security.security.entities.Role;
import com.pruebas.security.security.enums.RoleList;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Luis
 */
public interface RoleRepository extends JpaRepository <Role, Integer> {
    Optional<Role> findByRoleName(RoleList roleName);
    
}
