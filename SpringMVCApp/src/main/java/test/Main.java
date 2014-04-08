package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Nguyen D. Ngo on 4/9/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("test start");
        ApplicationContext context = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
        System.out.println("test finish");
    }
}
