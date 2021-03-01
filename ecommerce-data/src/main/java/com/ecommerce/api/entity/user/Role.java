package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;

public class Role extends BaseEntity {

  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
