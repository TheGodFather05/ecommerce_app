package com.ecommerce.api.entity.business;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter
@Setter
public class BusinessCategory extends BaseEntity {
    private String name;
    private String description;
}
