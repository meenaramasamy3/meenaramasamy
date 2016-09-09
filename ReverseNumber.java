import java.util.Scanner;

public class ReverseNumber {

		   public static void main(String[] args) {
		       Scanner s = new Scanner(System.in);
		       System.out.print("Enter the number to be reversed : ");
		       int input = s.nextInt();
		       int r = reverse(input);
		       System.out.println("The reversed number is " + r);
		   }

		   public static int reverse(int n) {
		       int r = 0;
		       int rem;
		       while (n > 0) {
		           rem = n % 10;
		           n = n / 10;
		           r = r * 10 + rem;
		       }
		       return r;
		   }
		}



