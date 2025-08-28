import java.util.Scanner;
public class ConvertCharacter{
public static void main(String[] args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter a character:");
ch=sc.next().charAt(0);
if(Character.isLowerCase(ch)){
ch=(Character.toUpperCase(ch));
System.out.println("character in uppercase:"+ch);
}
else if(Character.isUpperCase(ch)){
ch=Character.toLowerCase(ch);
System.out.println("character in lowercase:"+ch);
}
else
System.out.println("it is not an alphabet character");
}
}

