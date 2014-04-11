package qsoft.main.java.testBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qsoft.main.java.testBean.HelloSpring;

public class Main {

  public static void main(String[] args) throws Exception {
    
//    BeanFactory beanFactory =
//      new ClassPathXmlApplicationContext(
//        "/qsoft/main/Beans.xml");
//
//    CustomerQuery query =
//      (CustomerQuery)beanFactory.getBean("customerQuery");
//
//    Customer customer = query.getCustomerByName("Java Joe");
//
//    System.out.println(customer);
      BeanFactory beanFactory = new ClassPathXmlApplicationContext("/qsoft/main/java/testBean/applicationContext.xml");
      HelloSpring helloSpring = (HelloSpring) beanFactory.getBean("HelloSpring");
      System.out.println(helloSpring.getMessage());
    
  }
}
