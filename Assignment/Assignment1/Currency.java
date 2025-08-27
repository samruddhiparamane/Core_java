import java.util.Scanner;
public class Currency{
public static void main(String[] args){
int amount;
int note10,note5,note1,rem10,rem5;
Scanner sc=new Scanner(System.in);
System.out.println("enter a amount to withdrawn:");
amount=sc.nextInt();
note10=amount/10;
rem10=amount%10;
note5=rem10/5;
rem5=rem10%5;
note1=rem5;
System.out.println("currency note:");
System.out.println("number of 10 notes:"+note10);
System.out.println("number of 5 notes:"+note5);
System.out.println("number of 1 notes:"+note1);
}
}


