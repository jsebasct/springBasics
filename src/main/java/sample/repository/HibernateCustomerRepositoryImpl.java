package sample.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import sample.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	private String getDbUsername() {
		return dbUsername;
	}

	private void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
	
	/* (non-Javadoc)
	 * @see repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println("this is the new property:" + this.getDbUsername());
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstname("Juan");
		customer.setLastname("Valdez");
		
		customers.add(customer);
		
		return customers;
	}

	
	
}
