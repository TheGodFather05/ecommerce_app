package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.user.User;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Cart")
public class Cart extends BaseEntity {

    /*@Column(name = "user_id")
    private long userId;*/
    @Column
    private boolean sold;
    @Column
    private String state;
    @ManyToOne(targetEntity = User.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(targetEntity = CartProduct.class, mappedBy = "cartId"
            , cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<CartProduct> cartProducts = new HashSet<>();
    @OneToOne
    @JoinColumn(name = "sale_id")
    @Nullable
    private Sales sales;

    /*public long getUserId() {
        return userId;
    }

    public void setUserId(long idUser) {
        this.userId = idUser;
    }*/


    public boolean getSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public boolean isSold() {
        return sold;
    }

    @Nullable
    public Sales getSales() {
        return sales;
    }

    public void setSales(@Nullable Sales sales) {
        this.sales = sales;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(Arrays.stream(CartState.values())
                .anyMatch(x->x.label.equalsIgnoreCase(state)))
        this.state = state;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(Set<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
