import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.service.CustomerService;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService cs = appContext.getBean("customerService", CustomerService.class);
		
		
		System.out.println(cs.findAll().get(0).getFirstname());
	}

}
