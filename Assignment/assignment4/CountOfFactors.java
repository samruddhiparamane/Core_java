import java.util.Scanner;
public class CountOfFactors{
public static void main(String[] args){
int n,i,cnt=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
for(i=1;i<n;i++){
if(n%i==0)
cnt++;
}
System.out.println("count of factors:"+cnt);
}
}
