import java.util.Scanner;
public class Cylinder{
public static void main(String args[]){
float r,h;
double surfacearea,volume;
Scanner sc=new Scanner(System.in);
System.out.println("enter a radius");
r=sc.nextFloat();
System.out.println("enter a height");
h=sc.nextFloat();
surfacearea=2*Math.PI*r*r+2*Math.PI*r*h;
volume=Math.PI*r*r*h;
System.out.println("surface area of cylinder is :"+surfacearea);
System.out.println("volume of cylinder is:"+volume);
}
}


