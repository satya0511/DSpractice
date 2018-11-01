package springPrac.basics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainAppAutoWireByName {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      editorText te = (editorText)context.getBean("editorText");
      te.spellCheck();
   }
}

