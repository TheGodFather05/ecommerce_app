package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.business.Business;
import com.ecommerce.api.entity.category.*;
import com.ecommerce.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
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
    @Column
    private String brand;
    @Column
    private String state;
    @ManyToOne
    @JoinColumn(name = "id_Category")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "id_Subcategory")
    private SubCategory subCategory;
    @ManyToOne
    @JoinColumn(name = "id_User_Creator")
    private User creator;
    @OneToMany
    @JoinColumn(name = "id_user")
    private Set<ProductSubcategoryProperties> subcategoryProperties = new HashSet<>();
    @OneToMany
    @JoinColumn(name = "id_user")
    private Set<ProductCategoryProperty> categoryProperties = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "id_business")
    private Business business;


}
