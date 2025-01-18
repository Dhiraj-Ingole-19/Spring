import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shop implements InitializingBean, DisposableBean{
	public Shop() {
		
		System.out.println("Shop  Bean Created..");
	}

	public void greetCustomer() {
		
		System.out.println("Welcome ! to the shop.");
	}
	
	
	public void service() {
		System.out.println("Service method called");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("dustrection methods called");
	}
		
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initilization methodds called ");
		
	}
	
}
