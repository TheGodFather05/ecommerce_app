package com.ecommerce.api.data.user;


import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository<T> extends JpaRepository<T,Long> {

}
