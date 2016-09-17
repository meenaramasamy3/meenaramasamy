class Power{
public static void main(String angt[]){
Scanner sc = new Scanner(System.in);
int num1, num2;
double num;
System.out.println("Enter a number");
num1=sc.nextInt();
System.out.println("Enter a power of the number");
num2=sc.nextInt();
// Finding power of a number
num=Math.pow(num1,num2);
System.out.println(num);
}
