package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import javax.xml.stream.XMLInputFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;

/**
 * Created by Nguyen D. Ngo on 4/9/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("test start");
        try {
            InputStream is = new FileInputStream("mvc-dispatcher-servlet.xml");
            XmlBeanFactory xbf = new XmlBeanFactory((Resource) is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //ApplicationContext context = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
        System.out.println("test finish");
    }
}
