import java.util.Scanner;
public class SumOfEven1ToN{
public static void main(String[] args){
int sum=0,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(i%2==0)
sum+=i;
}
System.out.println("sum of 1 to n is :"+sum);
}
}
