package com.ecommerce.api.entity.localization;


import com.ecommerce.api.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table
public class Country extends BaseEntity {


    @Column
    private String name;
    @OneToMany(mappedBy = "id_country")
    private Set<Town> towns = new HashSet<>();

}
