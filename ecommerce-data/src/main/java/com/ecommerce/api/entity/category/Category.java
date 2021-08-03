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
    @OneToMany(mappedBy = "category",targetEntity = SubCategory.class)
    private Set<SubCategory> subCategories = new HashSet<>();
    @OneToMany(mappedBy = "category",targetEntity = CategoryProperties.class)
    private Set<CategoryProperties> properties = new HashSet<>();
    @OneToMany(mappedBy = "category",targetEntity = Product.class)
    private Set<Product> products = new HashSet<>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public Set<CategoryProperties> getProperties() {
        return properties;
    }

    public void setProperties(Set<CategoryProperties> properties) {
        this.properties = properties;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
