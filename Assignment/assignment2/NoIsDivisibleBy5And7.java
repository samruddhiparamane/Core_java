import java.util.Scanner;
public class NoIsDivisibleBy5And7{
public static void main(String[] args){
int no;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
no=sc.nextInt();
if((no%5==0) && (no%7==0))
System.out.println("no is divisible by 5 and 7");
else if((no%5==0)) 
System.out.println("no is divisible by 5");
else if((no%7==0))
System.out.println("no is divisible by 7");
else
System.out.println("no is not divisible by 5 and 7");
}
}


