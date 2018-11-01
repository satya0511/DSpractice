package springPrac.basics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      helloWorld obj = (helloWorld) context.getBean("helloWorld");
      helloUniverse obj2 = (helloUniverse) context.getBean("helloUniverse");
      obj.getMessage();
      obj2.getMessage();
      context.registerShutdownHook();
   }
}