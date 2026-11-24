package com.frankmoley.lil.data.entity;

import java.util.UUID;

/***
 * Customer has attributes:
  * customer_id UUID PRIMARY KEY,
  * first_name VARCHAR,
  * last_name VARCHAR,
  * email VARCHAR UNIQUE,
  * phone VARCHAR,
  * address VARCHAR
 */
public class Customer {
  //aggiungere gli attibuti
  private UUID customerId;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private String address;

  //aggiungere i metodi get, set
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  
  @Override 
  public String toString() {
    return "Customer [id = " + customerId + ", first_name= "+ this.firstName +
    ", last_name= "+ this.lastName +", email= "+ email +", phone= "+ phone +", address= " + address+ "]";
  }

}
