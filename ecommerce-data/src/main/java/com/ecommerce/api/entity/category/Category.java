package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Category extends BaseEntity {

    @Column
    private String title;
    @OneToMany(mappedBy = "id_Category")
    private Set<SubCategory> subCategories = new HashSet<>();
    @OneToMany(mappedBy = "id_Category")
    private Set<CategoryProperties> properties = new HashSet<>();
    @OneToMany(mappedBy = "id_Category")
    private Set<Product> products = new HashSet<>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
