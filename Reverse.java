import java.util.Scanner;


public class Reverse {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        StringBuffer s1=new StringBuffer(s);
        StringBuffer s2=new StringBuffer(s1);
        System.out.println(s1.reverse());
	}

}
