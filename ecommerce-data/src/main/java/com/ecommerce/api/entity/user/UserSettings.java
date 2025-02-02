package com.ecommerce.api.entity.user;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.misc.Currency;
import com.ecommerce.api.entity.translate.Language;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table
public class UserSettings extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "id_User")
  private User user;
  @ManyToOne
  @JoinColumn(name = "id_Currency")
  private Currency currency;
  @ManyToOne
  @JoinColumn(name = "id_Language")
  private Language language;


}
