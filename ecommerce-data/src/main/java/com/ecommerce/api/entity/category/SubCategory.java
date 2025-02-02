package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.Category;
import com.ecommerce.api.entity.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class SubCategory extends BaseEntity {

    @Column
    private String title;
    @ManyToOne
    @JoinColumn(name = "id_Category")
    private Category category;
    @OneToMany(mappedBy = "id_Subcategory")
    private Set<SubcategoryProperties> properties = new HashSet<>();
    @OneToMany(mappedBy = "id_Subcategory")
    private Set<Product> products = new HashSet<>();

}
