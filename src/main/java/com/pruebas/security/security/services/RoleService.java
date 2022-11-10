package com.pruebas.security.security.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.pruebas.security.security.entities.Role;
import com.pruebas.security.security.enums.RoleList;
import com.pruebas.security.security.respositories.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Luis
 */
@Service
@Transactional
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Optional<Role> getByRoleName(RoleList roleName){
        return roleRepository.findByRoleName(roleName);
    }
    
    
}
