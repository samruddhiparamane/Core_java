import java.util.Scanner;
public class SumOfDigits{
public static void main(String[] args){
int n,r,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
while(n>0){
r=n%10;
s+=r;
n=n/10;
}
System.out.print("sum of digits:"+s);
}
}
