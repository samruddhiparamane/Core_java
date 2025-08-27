import java.util.Scanner;
public class SalaryEmployee{
public static void main(String[] args){
int id,basicsalary;
double hra,da,tax,homesalary;
Scanner sc=new Scanner(System.in);
System.out.println("enter emplyee id:");
id=sc.nextInt();
System.out.println("enter a basic salary:");
basicsalary=sc.nextInt();
hra=0.10*basicsalary;
da=0.30*basicsalary;
tax=0.05*basicsalary;
homesalary=basicsalary+hra+da-tax;
System.out.println("employee id:"+id);
System.out.println("employee salary:"+basicsalary);
System.out.println("house rent allowance:"+hra);
System.out.println("Dearness allowance:"+da);
System.out.println("professional tax:"+tax);
System.out.println("home salary:"+homesalary);
}
}
