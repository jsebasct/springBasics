package repository;

import java.util.List;

import model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}