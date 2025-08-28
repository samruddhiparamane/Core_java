import java.util.Scanner;
public class MaxThree{
public static void main(String[] args){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number");
a=sc.nextInt();
System.out.println("enter 2nd number");
b=sc.nextInt();
System.out.println("enter 3rd number");
c=sc.nextInt();
if(a>=b && a>=c)
{
System.out.println("A is maximun");
}
else if(b>=a && b>=c)
{
System.out.println("B is maximum");
}
else
{
System.out.println("C is maximum");
}
}
}
