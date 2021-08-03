package com.ecommerce.api.entity.misc;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.user.User;

import javax.persistence.*;

@Entity
@Table
public class Review extends BaseEntity {

    @Column
    private double review;
    @Column
    private String comment;
    /*@Column
    private long idProduct;
    @Column
    private long idUser;*/
    @ManyToOne(targetEntity = Product.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Product")
    private Product product;
    @ManyToOne(targetEntity = User.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_User")
    private User user;


    public double getReview() {
        return review;
    }

    public void setReview(double review) {
        this.review = review;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


  /*public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }


  public long getIdUser() {
    return idUser;
  }

  public void setIdUser(long idUser) {
    this.idUser = idUser;
  }*/


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
