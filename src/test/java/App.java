import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CustomerService;
import service.CustomerServiceImp;


public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService cs = appContext.getBean("customerService", CustomerService.class);
		
		//CustomerService cs = new CustomerServiceImp();
		
		System.out.println(cs.findAll().get(0).getFirstname());
	}

}
