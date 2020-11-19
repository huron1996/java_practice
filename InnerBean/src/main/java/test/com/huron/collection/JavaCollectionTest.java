package test.com.huron.collection;

import com.huron.collection.JavaCollection;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* JavaCollection Tester. 
* 
* @author <Authors name> 
* @since <pre>11月 19, 2020</pre> 
* @version 1.0 
*/ 
public class JavaCollectionTest { 
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CollectionBeans.xml");

        JavaCollection javaCollection = (JavaCollection)applicationContext.getBean("javaCollection");

        javaCollection.getAddressList();

        javaCollection.getAddressSet();

        javaCollection.getAddressMap();

        javaCollection.getAddressProp();
    }

} 
