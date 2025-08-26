import java.util.Scanner;
public class Cuboid{
public static void main(String[] args){
int l,b,h;
float surfacearea,volume;
Scanner sc=new Scanner(System.in);
System.out.println("enter a length:");
l=sc.nextInt();
System.out.println("enter a breadth:");
b=sc.nextInt();
System.out.println("enter a height:");
h=sc.nextInt();
surfacearea=2*(l*b+l*h+b*h);
volume=l*b*h;
System.out.println("surface area of cublod is:"+surfacearea);
System.out.println("volume of cuboid is:"+volume);
}
}



