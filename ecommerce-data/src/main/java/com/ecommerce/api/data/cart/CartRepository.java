package com.ecommerce.api.data.cart;


import com.ecommerce.api.entity.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
