package com.frankmoley.lil.data.entity;

import java.util.UUID;

/***
 * 
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

  //TODO: aggiungere i metodi get, set
  
  @Override 
  public String toString() {
    return "Customer [id = " + customerId + ", first_name= "+ this.firstName +
    ", last_name= "+ this.lastName +", email= "+ email +", phone= "+ phone +", address= " + address+ "]";
  }

}
