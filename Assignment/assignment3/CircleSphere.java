import java.util.Scanner;
public class CircleSphere{
public static void main(String[] args){
float r;
int ch;
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("\n enter radius :");
r=sc.nextFloat();
System.out.println("\n1:Area of circle \n2: circumference of circle \n3: volume of sphere \n4:exit \n enter your choice:");
ch=sc.nextInt();
switch(ch){
case 1->System.out.println("area of circle:"+(Math.PI*(r*r)));
case 2->System.out.println("circumference of circle:"+(2*Math.PI*r));
case 3->System.out.println("volume of sphere :"+((4.0/3)*Math.PI*(r*r*r)));
case 4->{
System.out.println("Exited");
return;
}
default->System.out.println("invalid choice");
}
}
}
}
