import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	

	Employee employee=(Employee) context.getBean("employee");
	
       System.out.println("Employee Detail:"+employee);
	}
}
