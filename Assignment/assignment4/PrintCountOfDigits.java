import java.util.Scanner;
public class PrintCountOfDigits{
public static void main(String[] args){
int n,r,cnt=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
while(n>0){
r=n%10;
cnt++;
n=n/10;
}
System.out.println("count:"+cnt);
}
}
