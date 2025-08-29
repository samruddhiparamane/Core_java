import java.util.Scanner;
public class XOfN{
public static void main(String[] args){
int res=1,x,n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter x:");
x=sc.nextInt();
System.out.println("enter n:");
n=sc.nextInt();
for(i=1;i<=n;i++){
res=res*x;
}
System.out.println("x^n : "+res);
}
}

