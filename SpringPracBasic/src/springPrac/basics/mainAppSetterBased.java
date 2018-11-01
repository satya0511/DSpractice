package springPrac.basics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mainAppSetterBased {

   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      txtEdtr te = (txtEdtr) context.getBean("editorText");
      te.spellCheck();
   }
}

