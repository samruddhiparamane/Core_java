import java.util.Scanner;
public class PrintXToy{
public static void main(String[] args){
int i,x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter starting no:");
x=sc.nextInt();
System.out.println("enter ending no:");
y=sc.nextInt();
if(y<x)
System.out.println("starting number must be greater than ending no");
for(i=x;i<=y;i++)
System.out.println(i);
}
}
