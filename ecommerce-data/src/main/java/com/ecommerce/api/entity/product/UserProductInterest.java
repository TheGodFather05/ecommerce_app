package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class UserProductInterest extends BaseEntity {

  @Column
  private long nbrTimes;
  @Column
  private java.sql.Timestamp lastInterest;
  @ManyToOne
  @JoinColumn(name = "id_User")
  private User user;
  @ManyToOne
  @JoinColumn(name = "id_Product")
  private Product product;


}
