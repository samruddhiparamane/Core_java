import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
int n,i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
for(i=1;i<=n;i++){
fact*=i;
}
System.out.println("factorial is:"+fact);
}
}
