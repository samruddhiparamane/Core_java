import java.util.Scanner;
public class Compare{
public static void main(String[] args){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers:");
System.out.println("enter A:");
a=sc.nextInt();
System.out.println("enter B");
b=sc.nextInt();
if(a==b){
System.out.println("numbers are equal");
}else if(a>b)
{
System.out.println("A is greater than B");
}else
{
System.out.println("B is greater than A");
}
}
}