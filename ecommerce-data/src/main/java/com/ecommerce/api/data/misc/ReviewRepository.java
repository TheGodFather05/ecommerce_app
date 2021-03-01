package com.ecommerce.api.data.misc;


import com.ecommerce.api.entity.misc.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {

}
