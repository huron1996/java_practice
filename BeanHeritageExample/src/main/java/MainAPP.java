import com.huron.HelloIndia;
import com.huron.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
        helloWorld.getMessage1();
        helloWorld.getMessage2();

        HelloIndia helloIndia = (HelloIndia)applicationContext.getBean("helloIndea");
        helloIndia.getMessage1();
        helloIndia.getMessage2();
        helloIndia.getMessage3();
    }
}
