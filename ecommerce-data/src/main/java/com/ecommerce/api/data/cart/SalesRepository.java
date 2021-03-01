package com.ecommerce.api.data.cart;


import com.ecommerce.api.entity.cart.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales,Long> {

}
