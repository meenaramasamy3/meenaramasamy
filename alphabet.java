import java.util.Scanner;

public class Alphabet
{
    public static void main(String args[])
    {
        char a1;
        Scanner scan = new Scanner(System.in);
        a1 = scan.next().charAt(0);
		
        if((a1>='a' && ch<='z') || (a1>='A' && a1<='Z'))
        {
            System.out.print(a1 + " is an Alphabet");
        }
        else
        {
            System.out.print(a1 + " is not an Alphabet");
        }
    }
}
