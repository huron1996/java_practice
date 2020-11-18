import com.huron.HelloWorld;
import org.junit.Test;

public class MyTest {

    @Test
    public void helloTest(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage1("Hello, I am huron");
        helloWorld.getMessage1();
    }
}
