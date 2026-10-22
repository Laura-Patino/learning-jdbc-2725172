package com.frankmoley.lil.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.frankmoley.lil.data.entity.Customer;

public class CustomerDao implements Dao<Customer, UUID> {

  //Implementazione dei metodi della interfaccia Dao per la tabella Customer
  @Override 
  public List<Customer> getAll() {
    return null;
  }

  @Override 
  public Customer create(Customer entity) {
    return null;
  }

  @Override 
  public Optional<Customer> getOne(UUID id){
    return null;
  }

  @Override 
  public Customer update(Customer entity) {
    return null;
  }

  @Override 
  public void delete(UUID id){

  }

}
