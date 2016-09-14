import java.util.Scanner;


public class Factorial {

	   public static void main(String args[])
	   {
	      int num, c, fact = 1;
	 
	      System.out.println("Enter the factorial number");
	      Scanner in = new Scanner(System.in);
	 
	      num = in.nextInt();
	 
	      if ( num < 0 )
	         System.out.println("Number is non-negative.");
	      else
	      {
	         for ( c = 1 ; c <= num ; c++ )
	            fact = fact*c;
	 
	         System.out.println(fact);
	      }
	   }
}
	
