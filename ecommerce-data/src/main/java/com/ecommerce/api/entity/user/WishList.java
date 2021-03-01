package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;

public class WishList extends BaseEntity {

  private long idUser;
  private long idProduct;
  private User user;
  private Product product;


  public long getIdUser() {
    return idUser;
  }

  public void setIdUser(long idUser) {
    this.idUser = idUser;
  }


  public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }


  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
