package com.ecommerce.api.data.cart;


import com.ecommerce.api.entity.cart.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartProductRepository extends JpaRepository<CartProduct,Long> {

}
