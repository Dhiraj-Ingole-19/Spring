import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Shop {
	public Shop() {
		
		System.out.println("Shop  Bean Created..");
	}

	public void greetCustomer() {
		
		System.out.println("Welcome ! to the shop.");
	}
	@PostConstruct
	public void inita() {
		
		System.out.println("initilization methodds called ");
	}
	
	public void service() {
		System.out.println("Service method called");
	}
	@PreDestroy
	public void destroya() {
		System.out.println("dustrection methods called");
	}
	
}
