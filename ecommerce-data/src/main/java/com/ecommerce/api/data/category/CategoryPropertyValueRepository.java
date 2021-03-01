package com.ecommerce.api.data.category;


import com.ecommerce.api.entity.category.CategoryPropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryPropertyValueRepository extends JpaRepository<CategoryPropertyValue,Long> {

  }

