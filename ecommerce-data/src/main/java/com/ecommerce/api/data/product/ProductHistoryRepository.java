package com.ecommerce.api.data.product;


import com.ecommerce.api.entity.product.ProductHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductHistoryRepository extends JpaRepository<ProductHistory,Long> {

}
