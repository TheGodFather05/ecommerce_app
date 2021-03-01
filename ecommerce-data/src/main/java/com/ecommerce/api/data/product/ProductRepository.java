package com.ecommerce.api.data.product;


import com.ecommerce.api.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
