import java.util.Scanner;
public class SumOf1ToN{
public static void main(String[] args){
int sum=0,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
for(i=1;i<=n;i++)
sum+=i;
System.out.println("sum of 1 to n is:"+sum);

//without loop 

System.out.println("enter a no:");
n=sc.nextInt();
sum=0;
sum=(n*(n+1))/2;
System.out.println("sum of 1 to n is:"+sum);
}
}
