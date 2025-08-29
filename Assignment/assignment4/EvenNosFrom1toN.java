import java.util.Scanner;
public class EvenNosFrom1toN{
public static void main(String[] args){
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
if(n<1)
System.out.println("number must be greater than 1");
System.out.println("even nos:");
for(i=1;i<=n;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}
