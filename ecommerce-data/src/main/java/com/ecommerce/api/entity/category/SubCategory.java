package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.Category;
import com.ecommerce.api.entity.product.Product;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class SubCategory extends BaseEntity {

    /*@Column
    private long idCategory;*/
    @Column
    private String title;
    @ManyToOne(targetEntity = Category.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Category")
    private Category category;
    @OneToMany(mappedBy = "subCategory", targetEntity = SubcategoryProperties.class
            , cascade = CascadeType.ALL)
    private Set<SubcategoryProperties> properties = new HashSet<>();
    @OneToMany(mappedBy = "subCategory")
    private Set<Product> products = new HashSet<>();


    /*public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }*/


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<SubcategoryProperties> getProperties() {
        return properties;
    }

    public void setProperties(Set<SubcategoryProperties> properties) {
        this.properties = properties;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
