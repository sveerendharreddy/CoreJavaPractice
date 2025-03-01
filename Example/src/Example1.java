import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example1 {
	
	 // generic method printArray
	   public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	        /* System.out.printf("%s ", element);*/
	        /* System.out.printf(element.toString()+" ");*/
	    	  System.out.print(element+" ");
	      }
	      System.out.println();
	   }
	   
public static void main(String[] args) throws ParseException {
    // Create arrays of Integer, Double and Character
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.println("Array integerArray contains:");
    printArray(intArray);   // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray);   // pass a Double array

    System.out.println("\nArray characterArray contains:");
    printArray(charArray);   // pass a Character array

    int[] numbers = new int[0];
    int length = numbers.length;
}
}
