import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Employee.class);
		
		Employee e =(Employee)ac.getBean("emp");
		System.out.println(e);
	
	}

}
