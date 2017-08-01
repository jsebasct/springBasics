import service.CustomerService;
import service.CustomerServiceImp;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService cs = new CustomerServiceImp();
		
		System.out.println(cs.findAll().get(0).getFirstname());
	}

}
