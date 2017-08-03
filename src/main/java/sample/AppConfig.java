package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.repository.CustomerRepository;
import sample.repository.HibernateCustomerRepositoryImpl;
import sample.service.CustomerService;
import sample.service.CustomerServiceImp;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImp res = new CustomerServiceImp(getCustomerRepository());
		//res.setCustomerRepository(getCustomerRepository());
		return res;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
