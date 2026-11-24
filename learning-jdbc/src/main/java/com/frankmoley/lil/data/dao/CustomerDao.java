package com.frankmoley.lil.data.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

import com.frankmoley.lil.data.entity.Customer;
import com.frankmoley.lil.data.util.DatabaseUtils;

public class CustomerDao implements Dao<Customer, UUID> {
  private static final Logger LOGGER = Logger.getLogger(CustomerDao.class.getName());

  //QUERIES
  private static final String GET_ALL = "select * from wisdom.customers";

  //LETTURA TABELLA. serve a tradurre le righe del database in oggetti Java. 
  // È il "ponte" tra il mondo relazionale (tabelle, righe, colonne) e il mondo aoggetti (classi, istanze). 
  private List<Customer> processResultSet(ResultSet rs) throws SQLException {
    List<Customer> customers = new ArrayList<>();

    while(rs.next()) {
      Customer customer = new Customer();
      customer.setCustomerId((UUID)rs.getObject("customer_id"));
      customer.setFirstName(rs.getString("first_name"));
      customer.setLastName(rs.getString("last_name"));
      customer.setEmail(rs.getString("email"));
      customer.setPhone(rs.getString("phone"));
      customer.setAddress(rs.getString("address"));
      //aggiunta nella Lista di ogni customer
      customers.add(customer);
    }
    return customers;
  }

  //Implementazione dei metodi della interfaccia Dao per la tabella Customer
  @Override 
  public List<Customer> getAll() {
    List<Customer> customers = new ArrayList<>();
    Connection connection = DatabaseUtils.getConnection();

    try(Statement statement = connection.createStatement()) {
      ResultSet rs = statement.executeQuery(GET_ALL);
      customers = this.processResultSet(rs); //restituisco la List di customer che rispondeono alla query
    } catch (SQLException e) {
      DatabaseUtils.handleSqlException("CustomerDAO.getAll", e, LOGGER);
    }

    return customers;
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
