package com.ecommerce.api.entity.misc;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table
public class Shiper extends BaseEntity {

    @Column
    private String name;


}
