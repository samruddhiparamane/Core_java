import java.util.Scanner;
public class PerfectNo{
public static void main(String[] args){
int n,temp,s=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
temp=n;
for(i=1;i<n;i++){
if(n%i==0)
s+=i;
}
if(temp==s)
System.out.println("no is perfect");
else
System.out.println("no is not perfect");
}
}
