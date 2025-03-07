import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student s1 = (Student) factory.getBean("stud");
        s1.display();

        Student s2 = (Student) factory.getBean("stud");
        s2.display();
    }
}
