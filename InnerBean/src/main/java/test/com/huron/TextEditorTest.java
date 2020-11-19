package test.com.huron;

import com.huron.TextEditor;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* TextEditor Tester. 
* 
* @author <Authors name> 
* @since <pre>11月 19, 2020</pre> 
* @version 1.0 
*/ 
public class TextEditorTest { 

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansByName.xml");

        TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");

        textEditor.spellCheck();
    }


    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansByType.xml");

        TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");

        textEditor.spellCheck();
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstructerBeans.xml");

        TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");

        textEditor.spellCheck();
    }
} 
