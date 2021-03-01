package com.ecommerce.api.data.user;


import com.ecommerce.api.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
