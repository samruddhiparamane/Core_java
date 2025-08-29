import java.util.Scanner;
public class MultiplicationTable{
public static void main(String[] args){
int i,n,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no to print multiplication table:");
n=sc.nextInt();
for(i=1;i<=n;i++){
System.out.println("\nTable of "+i);
for(j=1;j<=10;j++){
System.out.println(i+"*"+j+":"+(i*j));
}
}
}
}
