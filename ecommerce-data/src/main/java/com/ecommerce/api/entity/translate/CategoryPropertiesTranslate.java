package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.SubcategoryProperties;

public class CategoryPropertiesTranslate  extends BaseEntity {

  private String title;
  private long idSubcategoryProperty;
  private long idLanguage;
  private SubcategoryProperties subcategoryProperties;


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getIdSubcategoryProperty() {
    return idSubcategoryProperty;
  }

  public void setIdSubcategoryProperty(long idSubcategoryProperty) {
    this.idSubcategoryProperty = idSubcategoryProperty;
  }

  public long getIdLanguage() {
    return idLanguage;
  }

  public void setIdLanguage(long idLanguage) {
    this.idLanguage = idLanguage;
  }


  public SubcategoryProperties getSubcategoryProperties() {
    return subcategoryProperties;
  }

  public void setSubcategoryProperties(SubcategoryProperties subcategoryProperties) {
    this.subcategoryProperties = subcategoryProperties;
  }
}
