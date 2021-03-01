package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.Category;

public class SubCategory extends BaseEntity {

  private long idCategory;
  private String title;
  private Category category;


  public long getIdCategory() {
    return idCategory;
  }

  public void setIdCategory(long idCategory) {
    this.idCategory = idCategory;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
