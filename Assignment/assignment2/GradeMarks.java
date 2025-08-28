import java.util.Scanner;
public class GradeMarks{
public static void main(String[] args){
int total,m1,m2,m3;
double avg,p;
Scanner sc=new Scanner(System.in);
System.out.println("enter marks of subject 1:");
m1=sc.nextInt();
System.out.println("enter marks of subject 2:");
m2=sc.nextInt();
System.out.println("enter marks of subject 3:");
m3=sc.nextInt();
total=m1+m2+m3;
avg=total/3;
p=(total/300)*100;
System.out.println("total marks="+total);
System.out.println("average marks="+avg);
if(p<75)
System.out.println("Grade:class I");
else if(p>50 && p<=70)
System.out.println("Grade:class II");
else if(p>35 && p<50)
System.out.println("Grade:class III");
else
System.out.println("Grade:fail");
}
}
