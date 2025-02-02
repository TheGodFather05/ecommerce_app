package com.ecommerce.api.entity.category;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class SubcategoryProperties extends BaseEntity {

  @Column
  private long idSubcategory;
  @Column
  private String title;
  @ManyToOne
  @JoinColumn(name = "id_Subcategory")
  private SubCategory subCategory;
  @OneToMany(mappedBy = "id_Property")
  private Set<SubcategoryPropertyValue>values=new HashSet<>();

}
