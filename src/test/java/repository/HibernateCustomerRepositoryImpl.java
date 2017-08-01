package repository;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstname("Juan");
		customer.setLastname("Valdez");
		
		customers.add(customer);
		
		return customers;
	}
	
}
