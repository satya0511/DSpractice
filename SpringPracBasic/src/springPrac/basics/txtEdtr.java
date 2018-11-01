package springPrac.basics;

public class txtEdtr {
   private splChkr splChecker;

   // a setter method to inject the dependency.
   public void setsplChecker(splChkr splChecker) {
      System.out.println("Inside setSpellChecker." );
      this.splChecker = splChecker;
   }
   // a getter method to return spellChecker
   public splChkr getsplChecker() {
      return splChecker;
   }
   public void spellCheck() {
	   splChecker.checkSpelling();
   }
}
