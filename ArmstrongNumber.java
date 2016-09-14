import java.util.*;
import java.io.*;
public class ArmstrongNumber {
	public static void main(String args[])
	{
		
		int n;
	
		int num=Integer.parseInt(args[0]);
		n=num;
		int rem,a=0;
		while(num>0)
		{
			rem=num%10;
			a=(int) (a+Math.pow(rem, 3));
			num=num/10;
		}
		if(a==n)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}

}
