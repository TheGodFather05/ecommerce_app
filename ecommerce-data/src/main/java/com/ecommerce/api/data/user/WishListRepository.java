package com.ecommerce.api.data.user;


import com.ecommerce.api.entity.user.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList,Long> {

}
