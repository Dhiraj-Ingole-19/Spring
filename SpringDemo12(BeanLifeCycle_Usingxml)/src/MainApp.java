import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Shop shobj=(Shop)ac.getBean("shbean");
		shobj.service();
	((AbstractApplicationContext)ac).registerShutdownHook();
		
	}

}
