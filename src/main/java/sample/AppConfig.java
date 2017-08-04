package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"sample"})
@PropertySource("app.properties")
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

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
