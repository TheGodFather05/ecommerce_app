package com.ecommerce.api.entity.business;

import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Country;
import com.ecommerce.api.entity.localization.Town;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter
@Setter
public class Business extends BaseEntity {
   private String name;
   private String description;
   private String address;
   private String phone;
   private String email;
   private Country country;
   private Town town;
}
