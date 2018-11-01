package springPrac.basics;

public class textEditor {
	   private spellChecker spellChecker;

	   public textEditor(spellChecker spellChecker) {
	      System.out.println("Inside txt constructor." );
	      this.spellChecker = spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}