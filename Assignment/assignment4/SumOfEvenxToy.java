import java.util.Scanner;
public class SumOfEvenxToy{
public static void main(String[] args){
int sum=0,i,x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter starting no:");
x=sc.nextInt();
System.out.println("enter ending no:");
y=sc.nextInt();
if(y<x)
System.out.println("staring no must be greater than ending no:");
for(i=x;i<=y;i++)
{
if(i%2==0)
sum+=i;
}
System.out.println("sum of x to y is :"+sum);
}
}


