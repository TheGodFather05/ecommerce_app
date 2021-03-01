package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;

public class Language  extends BaseEntity {

  private String code;
  private String title;


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

}
