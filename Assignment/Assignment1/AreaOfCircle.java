import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String args[]){
		float r;
		double area,circumferance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius ");
		r=sc.nextFloat();
		area=Math.PI*r*r;
		circumferance=2*Math.PI*r;
		System.out.println("Area of Circle is :"+area);
		System.out.println("Area of circumferance :"+circumferance);
	}
}