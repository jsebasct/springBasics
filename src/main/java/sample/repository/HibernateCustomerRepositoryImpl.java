package sample.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sample.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String dbUserName;
	
	/* (non-Javadoc)
	 * @see repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println("this is the username:" + dbUserName);
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstname("Juan");
		customer.setLastname("Valdez");
		
		customers.add(customer);
		
		return customers;
	}
	
}
