import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        

    	//---------- Lab 3 -------------

    	// Issue #6 - Print the current date
    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    	Date date = new Date();
    	System.out.println("Today's date is " + dateFormat.format(date) + ".");
    	
    	// Issue #7 - Print free memory available to JVM
    	System.out.println();
    	System.out.println("There are " + Runtime.getRuntime().freeMemory() + " bytes of free memory available to JVM.");

    		
    	/*  Lab 1 & 2 work commented out

    	// Preamble message from lab 2
    	System.out.println("Here ye : important announcement");
    	
    	// Original message from lab 1
    	System.out.println("Hello World!");
    	
    	//------------ Merge conflict additions -------------
    	
    	// Message to Alice on AliceBranch (lab2)
    	System.out.println("And hello Alice!");
    	
    	// Message to Bob on BobBranch (lab2)
    	System.out.println("And hi to Bob too!");
    	
    	//-----------Additions done the right way -----------------
    	
    	// Message to Charlie on CharlieBranch (lab2)
    	System.out.println("Hey Charlie!");
    	
    	//Message to Denise on DeniseBranch (lab2)
    	System.out.println("Hello Denise!");
    	
    	// Goodbye message from lab 2
    	System.out.println("See you later!");
    	
    	*/
    }
}
