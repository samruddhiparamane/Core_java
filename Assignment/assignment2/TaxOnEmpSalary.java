import java.util.Scanner;
public class TaxOnEmpSalary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
float basicsal;
double tax;
System.out.println("enter salary:");
basicsal=sc.nextFloat();
if(basicsal<150000)
tax=0;
else if(basicsal>150000 && basicsal<=300000)
tax=(basicsal-150000)*0.20;
else
tax=(150000*0.20)+((basicsal-300000)*0.30);
System.out.println("tax:"+tax);
}
}
