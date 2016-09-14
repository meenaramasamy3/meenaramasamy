package meena;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("enter the index :");
		int index=sc.nextInt();
		System.out.println("element in the "+index+" position");
		System.out.println(a[index]);
				
	}

}
