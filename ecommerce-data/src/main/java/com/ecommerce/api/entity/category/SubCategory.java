package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.Category;

import javax.persistence.*;

@Entity
@Table
public class SubCategory extends BaseEntity {

  @Column
  private long idCategory;
  @Column
  private String title;
  @ManyToOne
  @JoinColumn(name = "id_Category")
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
