package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.*;
import com.ecommerce.api.entity.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Product extends BaseEntity {

    @Column
    private String name;
    @Column
    private String code;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    private long quantity;
    @Column
    private String supplier;
    /*@Column
    private long idSubcategory;
    @Column
    private long idCategory;
    @Column
    private long idUserCreator;*/
    @Column
    private String brand;
    @Column
    private String state;
    @ManyToOne(targetEntity = Category.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Category")
    private Category category;
    @ManyToOne(targetEntity = SubCategory.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Subcategory")
    private SubCategory subCategory;
    @ManyToOne(targetEntity = User.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_User_Creator")
    private User creator;
    @OneToMany(mappedBy = "product", targetEntity = ProductSubcategoryProperties.class)
    private Set<ProductSubcategoryProperties> subcategoryProperties = new HashSet<>();
    @OneToMany(mappedBy = "product", targetEntity = ProductCategoryProperty.class)
    private Set<ProductCategoryProperty> categoryProperties = new HashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }


    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }


    /*public long getIdSubcategory() {
        return idSubcategory;
    }

    public void setIdSubcategory(long idSubcategory) {
        this.idSubcategory = idSubcategory;
    }


    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }


    public long getIdUserCreator() {
        return idUserCreator;
    }

    public void setIdUserCreator(long idUserCreator) {
        this.idUserCreator = idUserCreator;
    }*/


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }


    public Set<ProductSubcategoryProperties> getSubcategoryProperties() {
        return subcategoryProperties;
    }

    public void setSubcategoryProperties(Set<ProductSubcategoryProperties> subcategoryProperties) {
        this.subcategoryProperties = subcategoryProperties;
    }

    public Set<ProductCategoryProperty> getCategoryProperties() {
        return categoryProperties;
    }

    public void setCategoryProperties(Set<ProductCategoryProperty> categoryProperties) {
        this.categoryProperties = categoryProperties;
    }
}
