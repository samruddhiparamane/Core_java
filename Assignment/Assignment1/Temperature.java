import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
float t;
double celsius,kelvin;
Scanner sc=new Scanner(System.in);
System.out.println("enter temperature:");
t=sc.nextFloat();
celsius=(t-32)*5/9;
kelvin=celsius+273.15;
System.out.println("celsius:"+celsius);
System.out.println("kelvin:"+kelvin);
}
}
