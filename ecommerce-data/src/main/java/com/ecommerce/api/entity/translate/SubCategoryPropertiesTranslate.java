package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.SubcategoryProperties;
import com.ecommerce.api.entity.translate.Language;

import javax.persistence.*;

@Entity
@Table
public class SubCategoryPropertiesTranslate extends BaseEntity {

    @Column
    private String title;
    /* @Column
     private long idSubcategoryProperties;
     @Column
     private long idLanguage;*/
    @ManyToOne(targetEntity = SubcategoryProperties.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Subcategory_Properties")
    private SubcategoryProperties subcategoryProperties;
    @ManyToOne(targetEntity = Language.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Language")
    private Language language;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


  /*public long getIdSubcategoryProperties() {
    return idSubcategoryProperties;
  }

  public void setIdSubcategoryProperties(long idSubcategoryProperties) {
    this.idSubcategoryProperties = idSubcategoryProperties;
  }


  public long getIdLanguage() {
    return idLanguage;
  }

  public void setIdLanguage(long idLanguage) {
    this.idLanguage = idLanguage;
  }*/


    public SubcategoryProperties getSubcategoryProperties() {
        return subcategoryProperties;
    }

    public void setSubcategoryProperties(SubcategoryProperties subcategoryProperties) {
        this.subcategoryProperties = subcategoryProperties;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
