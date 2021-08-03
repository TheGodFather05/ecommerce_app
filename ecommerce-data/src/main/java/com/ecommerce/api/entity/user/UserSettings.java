package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.misc.Currency;
import com.ecommerce.api.entity.translate.Language;

import javax.persistence.*;

@Entity
@Table
public class UserSettings extends BaseEntity {

    /*@Column
    private long idUser;
    @Column
    private long idCurrency;
    @Column
    private long idLanguage;*/
    @ManyToOne(targetEntity = User.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_User")
    private User user;
    @ManyToOne(targetEntity = Currency.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Currency")
    private Currency currency;
    @ManyToOne(targetEntity = Language.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_Language")
    private Language language;

  /*public long getIdUser() {
    return idUser;
  }

  public void setIdUser(long idUser) {
    this.idUser = idUser;
  }


  public long getIdCurrency() {
    return idCurrency;
  }

  public void setIdCurrency(long idCurrency) {
    this.idCurrency = idCurrency;
  }


  public long getIdLanguage() {
    return idLanguage;
  }

  public void setIdLanguage(long idLanguage) {
    this.idLanguage = idLanguage;
  }*/


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
