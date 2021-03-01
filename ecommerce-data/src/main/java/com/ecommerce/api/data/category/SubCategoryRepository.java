package com.ecommerce.api.data.category;


import com.ecommerce.api.entity.category.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory,Long> {

}
