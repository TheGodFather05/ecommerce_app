package com.ecommerce.api.data.product;


import com.ecommerce.api.entity.product.UserProductInterest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProductInterestRepository extends JpaRepository<UserProductInterest,Long> {

}
