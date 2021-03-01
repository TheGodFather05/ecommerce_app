package com.ecommerce.api.entity.cart;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.user.User;

public class Cart extends BaseEntity {

  private long idUser;
  private long sold;
  private String state;
  private User user;

  public long getIdUser() {
    return idUser;
  }

  public void setIdUser(long idUser) {
    this.idUser = idUser;
  }


  public long getSold() {
    return sold;
  }

  public void setSold(long sold) {
    this.sold = sold;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
