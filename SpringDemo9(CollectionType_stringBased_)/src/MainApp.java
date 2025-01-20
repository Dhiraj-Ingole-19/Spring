import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve bean from Spring container
        Employee e = (Employee) ac.getBean("emp");
        
        // Display employee details using toString()
        System.out.println(e);
    }
}
