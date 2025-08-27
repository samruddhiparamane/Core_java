import java.util.Scanner;
public class Room{
public static void main(String[] args){
float l,b,h,dh,dw,wh,ww;
float wall_area,door_area,window_area,paintes_area,roof_area;
Scanner sc=new Scanner(System.in);
System.out.println("enter room length:");
l=sc.nextInt();
System.out.println("enter room breadth:");
b=sc.nextInt();
System.out.println("enter room height:");
h=sc.nextInt();
System.out.println("enter door height:");
dh=sc.nextInt();
System.out.println("enter door width:");
dw=sc.nextInt();
System.out.println("enter window height:");
wh=sc.nextInt();
System.out.println("enter window width:");
ww=sc.nextInt();
wall_area=2*(l*h)+2*(b*h);
door_area=dh*dw;
window_area=2*(ww*wh);
paintes_area=wall_area-door_area-window_area;
roof_area=l*b;
System.out.println("area to be painted(wall):"+paintes_area);
System.out.println("area to be roof:"+roof_area);
}
}
