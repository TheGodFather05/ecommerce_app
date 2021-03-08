package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table
public class SubcategoryProperties extends BaseEntity {

  @Column
  private long idSubcategory;
  @Column
  private String title;
  @ManyToOne
  @JoinColumn(name = "id_Subcategory")
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
