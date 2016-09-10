import java.util.Scanner;
 
public class Palindrome {
 
public static void main(String[] args)
{
 
 Scanner in = new Scanner(System.in);
 System.out.println("Enter a string");
 String s=in.nextLine();
 
 StringBuffer s1=new StringBuffer(s);
 StringBuffer s2=new StringBuffer(s1);
 
  s1.reverse();
 
 if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
   System.out.println("Palindrome");
    else
    System.out.println("Not Palindrome");
 
    }
}
