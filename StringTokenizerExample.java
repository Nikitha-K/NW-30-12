//program to demonstrate the usage of String Tokenizer

package nikitha;
import java.util.*;


public class StringTokenizerExample {
	  
	       public static void main(String args[]) 
	       { 
	           System.out.println("Using Constructor 1 - "); 
	           StringTokenizer st1 = new StringTokenizer("Break  this sentence into individual tokens,can you? ", "i"); 
	           while (st1.hasMoreTokens()) 
	               System.out.println(st1.nextToken()); 
	       }
	
	

}
