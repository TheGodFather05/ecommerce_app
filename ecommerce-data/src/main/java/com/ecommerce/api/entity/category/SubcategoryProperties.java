package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class SubcategoryProperties extends BaseEntity {

    /*@Column
    private long idSubcategory;*/
    @Column
    private String title;
    @ManyToOne(targetEntity = SubCategory.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Subcategory")
    private SubCategory subCategory;
    @OneToMany(mappedBy = "subcategoryProperties", targetEntity = SubcategoryPropertyValue.class
            , cascade = CascadeType.ALL)
    private Set<SubcategoryPropertyValue> propertiesValues = new HashSet<>();


  /*public long getIdSubcategory() {
    return idSubcategory;
  }

  public void setIdSubcategory(long idSubcategory) {
    this.idSubcategory = idSubcategory;
  }*/


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

    public Set<SubcategoryPropertyValue> getPropertiesValues() {
        return propertiesValues;
    }

    public void setPropertiesValues(Set<SubcategoryPropertyValue> values) {
        this.propertiesValues = values;
    }
}
