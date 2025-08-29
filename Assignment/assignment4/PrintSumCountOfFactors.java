import java.util.Scanner;
public class PrintSumCountOfFactors{
public static void main(String[] args){
int n,i,cnt=0,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
System.out.print("factors are:");
for(i=1;i<=n;i++){
if(n%i==0){
sum+=i;
cnt++;
System.out.println(" "+i);
}
}
System.out.println();
System.out.println("count of factors:"+cnt);
System.out.println("sum of factors:"+sum);
}
}

