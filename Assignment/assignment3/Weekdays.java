import java.util.Scanner;
public class WeekDays{
public static void main(String[] args){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
switch(n){
case 1->System.out.println("Sunday");
case 2->System.out.println("monday");
case 3->System.out.println("tuesday");
case 4->System.out.println("wendsay");
case 5->System.out.println("thursday");
case 6->System.out.println("friday");
case 7->System.out.println("Saturday");
default->System.out.println("Invalid choice");
}
}
}
