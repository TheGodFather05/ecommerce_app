package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.misc.Currency;
import com.ecommerce.api.entity.translate.Language;

public class UserSettings extends BaseEntity {

  private long idUser;
  private long idCurrency;
  private long idLanguage;
  private User user;
  private Currency currency;
  private Language language;

  public long getIdUser() {
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
  }


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
