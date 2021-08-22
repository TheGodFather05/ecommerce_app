package com.ecommerce.api.entity.misc;

import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;

import javax.persistence.*;

@Entity
@Table
public class Media extends BaseEntity {

    @Column
    private String path;
    @Column
    private String mimeType;
    @Column
    private String type;
    @ManyToOne(targetEntity = Product.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "product_id")
    private Product product;
}
