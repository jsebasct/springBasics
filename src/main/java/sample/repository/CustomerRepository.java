package sample.repository;

import java.util.List;

import sample.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}