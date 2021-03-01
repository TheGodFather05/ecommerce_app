package com.ecommerce.api.entity.product;


import com.ecommerce.api.entity.BaseEntity;
import com.ecommerce.api.entity.user.User;
import com.ecommerce.api.entity.category.Category;
import com.ecommerce.api.entity.category.SubCategory;

public class Product  extends BaseEntity {

  private String name;
  private String code;
  private String description;
  private double price;
  private long quantity;
  private String supplier;
  private long idSubcategory;
  private long idCategory;
  private long idUserCreator;
  private String brand;
  private String state;
  private Category category;
  private SubCategory subCategory;
  private User creator;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }


  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }


  public long getIdSubcategory() {
    return idSubcategory;
  }

  public void setIdSubcategory(long idSubcategory) {
    this.idSubcategory = idSubcategory;
  }


  public long getIdCategory() {
    return idCategory;
  }

  public void setIdCategory(long idCategory) {
    this.idCategory = idCategory;
  }


  public long getIdUserCreator() {
    return idUserCreator;
  }

  public void setIdUserCreator(long idUserCreator) {
    this.idUserCreator = idUserCreator;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public SubCategory getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(SubCategory subCategory) {
    this.subCategory = subCategory;
  }

  public User getCreator() {
    return creator;
  }

  public void setCreator(User creator) {
    this.creator = creator;
  }
}
