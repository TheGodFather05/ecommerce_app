package com.ecommerce.api.data.user;


import com.ecommerce.api.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
