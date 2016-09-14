import java.util.*;
import java.io.*;
class OddNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int lower=sc.nextInt();
int upper=sc.nextInt();
for(int i=lower;i<=upper;i++)
{
if(i%2!==0)
{
System.out.println(i);
}
}
}
