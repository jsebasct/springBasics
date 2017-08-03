package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.model.Customer;
import sample.repository.CustomerRepository;

//@Service("customerService")
public class CustomerServiceImp implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	// @Autowired
	public CustomerServiceImp() {
	}
	
	public CustomerServiceImp(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	// @Autowired
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		System.out.println("Throw setter inyection");
//		this.customerRepository = customerRepository;
//	}

}
