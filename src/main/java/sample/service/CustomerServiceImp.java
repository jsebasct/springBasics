package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import sample.model.Customer;
import sample.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImp implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImp() {
	}

	// @Autowired
	public CustomerServiceImp(CustomerRepository customerRepository) {
		System.out.println("Constructor Inyection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Throw setter inyection");
		this.customerRepository = customerRepository;
	}

}
