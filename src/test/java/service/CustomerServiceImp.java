package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;

public class CustomerServiceImp implements CustomerService {

	private CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
