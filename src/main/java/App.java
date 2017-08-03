import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.AppConfig;
import sample.service.CustomerService;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService cs = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(cs.findAll().get(0).getFirstname());
	}

}
