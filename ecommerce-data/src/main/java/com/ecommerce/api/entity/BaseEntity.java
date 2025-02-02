package com.ecommerce.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

}
