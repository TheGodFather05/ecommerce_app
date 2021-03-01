package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.Category;
import com.ecommerce.api.entity.translate.Language;

public class CategoryTranslate  extends BaseEntity {

  private String title;
  private long idCategory;
  private long idLanguage;
  private Category category;
  private Language language;


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getIdCategory() {
    return idCategory;
  }

  public void setIdCategory(long idCategory) {
    this.idCategory = idCategory;
  }


  public long getIdLanguage() {
    return idLanguage;
  }

  public void setIdLanguage(long idLanguage) {
    this.idLanguage = idLanguage;
  }


  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }


  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }
}
