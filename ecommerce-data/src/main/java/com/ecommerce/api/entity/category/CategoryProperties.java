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
public class CategoryProperties  extends BaseEntity {

  @Column
  private String title;
  @ManyToOne
  @JoinColumn(name = "id_Category")
  private Category category;
  @OneToMany(mappedBy = "id_Property")
  private Set<CategoryPropertyValue>values=new HashSet<>();

}
