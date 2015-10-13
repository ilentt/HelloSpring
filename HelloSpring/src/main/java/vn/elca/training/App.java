package vn.elca.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // ApplicationContext context = new ClasPathXmlApplicationContext("beans.xml");
        ApplicationContext contexts = new ClassPathXmlApplicationContext("beans.xml");
        HelloService service = (HelloService) contexts.getBean("helloService");
        Hello h = service.getHello();
        h.sayHello();
    }
}
