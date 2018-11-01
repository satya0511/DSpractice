package springPrac.basics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mainAppConstructorBased {

   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      textEditor te = (textEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}

