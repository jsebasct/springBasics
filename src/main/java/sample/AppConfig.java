package sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"sample"})
public class AppConfig {

//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImp res = new CustomerServiceImp();
//		//res.setCustomerRepository(getCustomerRepository());
//		return res;
//	}

//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}

}
