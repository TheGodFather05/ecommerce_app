package com.ecommerce.api.entity.translate;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.product.Product;
import com.ecommerce.api.entity.translate.Language;

import javax.persistence.*;

@Entity
@Table
public class ProductTranslate extends BaseEntity {

    @Column
    private String name;
    @Column
    private String description;
    /*@Column
    private long idProduct;
    @Column
    private long idLanguage;*/
    @ManyToOne(targetEntity = Product.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Product")
    private Product product;
    @ManyToOne(targetEntity = Language.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Language")
    private Language language;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


  /*public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }


  public long getIdLanguage() {
    return idLanguage;
  }

  public void setIdLanguage(long idLanguage) {
    this.idLanguage = idLanguage;
  }*/


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
