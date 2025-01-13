import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
	
                //  String files[]=new String[] {"innerBean.xml"};
                 //  ApplicationContext ac=new ClassPathXmlApplicationContext(files);


                       //or

                   ApplicationContext ac=new ClassPathXmlApplicationContext("innerBean.xml");
                   
                   Computer comp=(Computer)ac.getBean("cp");
                   comp.printData();

 		
		
	}

}
