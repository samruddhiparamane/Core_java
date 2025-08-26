import java.util.Scanner;
public class Mean{
public static void main(String[] args){
int a,b,arithmean,harmomean;
Scanner sc=new Scanner(System.in);
System.out.println("enter a first number:");
a=sc.nextInt();
System.out.println("enter a second number:");
b=sc.nextInt();
arithmean=a+b/2;
harmomean=a*b/a+b;
System.out.println("arithmatic mean is :"+arithmean);
System.out.println("harmonic mean is :"+harmomean);
}
}

 