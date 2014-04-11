package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Nguyen D. Ngo on 4/9/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("test start");
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Beans.xml"));

        System.out.println("test finish");
    }
}
