import java.util.Scanner;
public class TriangleValid{
public static void main(String[] args){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter A:");
a=sc.nextInt();
System.out.println("enter B:");
b=sc.nextInt();
System.out.println("enter C:");
c=sc.nextInt();
if(a+b>c && b+c>a && a+c>b)
System.out.println("triangle is valid");
else
System.out.println("triangle is invalid");
}
}


