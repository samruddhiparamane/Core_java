import java.util.Scanner;
public class EvenNosFromXtoY{
public static void main(String[] args){
int i,x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter starting number:");
x=sc.nextInt();
System.out.println("enter ending number:");
y=sc.nextInt();
if(y<x)
System.out.println("second number must be greater than first");
for(i=x;i<=y;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}
