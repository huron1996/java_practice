package com.huron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");
        textEditor.spellCheck();
    }
}
