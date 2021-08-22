package com.ecommerce.api.entity;

import com.ecommerce.api.entity.cart.CartProduct;
import com.ecommerce.api.entity.misc.Media;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
