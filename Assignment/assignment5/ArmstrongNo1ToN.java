import java.util.Scanner;
public class ArmstrongNo1ToN{
public static void main(String[] args){
int n,i,j,temp,r,cnt,num;
double s;
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
n=sc.nextInt();
for(i=1;i<=n;i++){
temp=i;
cnt=0;
num=temp;
while(num>0)
{
cnt++;
num=num/10;
}
num=temp;
s=0;
while(num>0){
r=num%10;
s=s+Math.pow(r,cnt);
num=num/10;
}
if(temp==s)
System.out.println(s);
}
}
}
