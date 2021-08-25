package com.ecommerce.api.data.user;


import com.ecommerce.api.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

   Optional<Role> findByName(String name);
}
