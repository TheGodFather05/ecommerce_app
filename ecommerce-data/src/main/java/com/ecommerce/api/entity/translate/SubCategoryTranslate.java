package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.SubCategory;
import com.ecommerce.api.entity.translate.Language;

import javax.persistence.*;

@Entity
@Table
public class SubCategoryTranslate extends BaseEntity {

    @Column
    private String title;
    /*@Column
    private long idSubcategory;
    @Column
    private long idLanguage;*/
    @ManyToOne(targetEntity = SubCategory.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Subcategory")
    private SubCategory subCategory;
    @ManyToOne(targetEntity = Language.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Language")
    private Language language;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


  /*public long getIdSubcategory() {
    return idSubcategory;
  }

  public void setIdSubcategory(long idSubcategory) {
    this.idSubcategory = idSubcategory;
  }


  public long getIdLanguage() {
    return idLanguage;
  }

  public void setIdLanguage(long idLanguage) {
    this.idLanguage = idLanguage;
  }*/


    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

}
