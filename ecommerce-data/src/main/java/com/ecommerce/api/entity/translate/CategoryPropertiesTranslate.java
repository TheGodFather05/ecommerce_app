package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.category.SubcategoryProperties;

import javax.persistence.*;

@Entity
@Table
public class CategoryPropertiesTranslate extends BaseEntity {

    @Column
    private String title;
    /*@Column
    private long idSubcategoryProperty;*/
    @Column
    private long idLanguage;
    @ManyToOne(targetEntity = SubcategoryProperties.class
            , cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Subcategory_Property")
    private SubcategoryProperties subcategoryProperties;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


  /*public long getIdSubcategoryProperty() {
    return idSubcategoryProperty;
  }

  public void setIdSubcategoryProperty(long idSubcategoryProperty) {
    this.idSubcategoryProperty = idSubcategoryProperty;
  }*/

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
