import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s=(Student)ac.getBean("s1");
		s.display();
		
		
	

	}

}
