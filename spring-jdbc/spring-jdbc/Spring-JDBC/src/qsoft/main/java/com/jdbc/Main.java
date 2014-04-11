package qsoft.main.java.com.jdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qsoft.main.java.testBean.HelloSpring;

/**
 * Created by Nguyen D. Ngo on 4/12/14.
 */
public class Main {
    public static void main(String[] args) {
        //BeanFactory beanFactory = new ClassPathXmlApplicationContext("/qsoft/main/java/testBean/applicationContext.xml");
        //HelloSpring helloSpring = (HelloSpring) beanFactory.getBean("HelloSpring");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/qsoft/main/java/com/jdbc/Beans.xml");
        //StudentJDBC studentJDBC = (StudentJDBC) beanFactory.getBean("jdbcTemp");
        StudentJDBC studentJDBC = (StudentJDBC) beanFactory.getBean("studentJdbc");
        System.out.println("create record to student table");
        studentJDBC.createEntity("Ngo Dinh Nguyen", 2342);

        //System.out.println(helloSpring.getMessage());
    }
}
