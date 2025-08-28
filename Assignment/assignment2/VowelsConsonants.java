import java.util.Scanner;
public class VowelsConsonants{
public static void main(String[] args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter a Character:");
ch=sc.next().charAt(0);
if (Character.isLowerCase(ch) && Character.isLetter(ch)) 
{
if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'){
System.out.println("is a vowel");
}else
{
System.out.println("is a constant");
}}
else
System.out.println("invalid input");
}
}
