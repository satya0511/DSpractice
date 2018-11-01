package springPrac.basics;

public class editorText {
 private chkSpl chkSpling;

	// a setter method to inject the dependency.
   public void setchkSpl(chkSpl chkSpl) {
      System.out.println("Inside setSpellChecker." );
      this.chkSpling = chkSpl;
   }
   // a getter method to return spellChecker
	   public chkSpl getchkSpl() {
      return chkSpling;
   }
   public void spellCheck() {
	   chkSpling.checkSpelling();
	   }
}
