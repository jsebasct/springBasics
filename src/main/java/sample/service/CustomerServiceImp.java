package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.model.Customer;
import sample.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImp implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;// = new
													// HibernateCustomerRepositoryImpl();

	@Autowired
	public CustomerServiceImp(CustomerRepository customerRepository) {
		System.out.println("Using constrcutor inyection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	// @Autowired
	// public void setCustomerRepository(CustomerRepository customerRepository)
	// {
	// System.out.print("Throw setter inyection");
	// this.customerRepository = customerRepository;
	// }

}
