package com.ecommerce.api.entity.localization;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.localization.Country;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class Town extends BaseEntity {

    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_Country")
    private Country country;

}
