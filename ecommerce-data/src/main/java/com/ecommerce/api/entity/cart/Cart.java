package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Cart")
@Getter
@Setter
public class Cart extends BaseEntity {

    @Column
    private long idUser;
    @Column
    private boolean sold;
    @Column
    private String state;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "id_user")
    private User user;
    @OneToMany(mappedBy = "cart_id")
    private Set<CartProduct> cartProducts = new HashSet<>();


}
