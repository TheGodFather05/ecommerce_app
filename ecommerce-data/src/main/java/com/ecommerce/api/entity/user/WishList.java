package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class WishList extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_User")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_Product")
    private Product product;


}
