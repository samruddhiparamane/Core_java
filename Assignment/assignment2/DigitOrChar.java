import java.util.Scanner;
public class DigitOrChar{
public static void main(String[] args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter a character:");
ch=sc.next().charAt(0);
if(Character.isLowerCase(ch))
System.out.println("it is an lowercase alphabet");
else if(Character.isUpperCase(ch))
System.out.println("it is an uppercase alphabet");
else if(Character.isDigit(ch))
System.out.println("it is digit");
else
System.out.println("it other than alphabet and digit");
}
}
