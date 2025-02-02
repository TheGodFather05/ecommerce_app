package com.ecommerce.api.entity.misc;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class Review extends BaseEntity {

    @Column
    private double review;
    @Column
    private String comment;
    @ManyToOne
    @JoinColumn(name = "id_Product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "id_User")
    private User user;


}
