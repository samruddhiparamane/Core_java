import java.util.Scanner;
public class Prevnextchar{
public static void main(String[] args){
char ch,pre,next;
Scanner sc=new Scanner(System.in);
System.out.println("enter a character:");
ch=sc.next().charAt(0);
pre=(char)(ch-1);
next=(char)(ch+1);
System.out.println("previous character :"+pre);
System.out.println("next character:"+next);
}
}
