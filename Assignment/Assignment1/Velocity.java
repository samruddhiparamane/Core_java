import java.util.Scanner;
public class Velocity{
public static void main(String args[]){
int u,a,t;
float finalvelocity,distance;
Scanner sc=new Scanner(System.in);
System.out.println("enter inital velocity");
u=sc.nextInt();
System.out.println("enter acceleration");
a=sc.nextInt();
System.out.println("enter time");
t=sc.nextInt();
finalvelocity=u+a*t;
distance=u+a*t*t;
System.out.println("final velocity is:"+finalvelocity);
System.out.println("distance is :"+distance);
}
}

