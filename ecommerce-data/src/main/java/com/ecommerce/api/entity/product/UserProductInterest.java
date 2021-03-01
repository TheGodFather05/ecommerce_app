package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.user.User;

public class UserProductInterest extends BaseEntity {

  private long idUser;
  private long idProduct;
  private long nbrTimes;
  private java.sql.Timestamp lastInterest;
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


  public long getNbrTimes() {
    return nbrTimes;
  }

  public void setNbrTimes(long nbrTimes) {
    this.nbrTimes = nbrTimes;
  }


  public java.sql.Timestamp getLastInterest() {
    return lastInterest;
  }

  public void setLastInterest(java.sql.Timestamp lastInterest) {
    this.lastInterest = lastInterest;
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
