package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

public class SubcategoryProperties extends BaseEntity {

  private long idSubcategory;
  private String title;
  private SubCategory subCategory;


  public long getIdSubcategory() {
    return idSubcategory;
  }

  public void setIdSubcategory(long idSubcategory) {
    this.idSubcategory = idSubcategory;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public SubCategory getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(SubCategory subCategory) {
    this.subCategory = subCategory;
  }
}
