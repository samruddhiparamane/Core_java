public class SumOf100To200{
public static void main(String[] args){
int sum=0,i;
for(i=100;i<=200;i++)
{
if(i%2==0)
sum+=i;
}
System.out.println("sum of 100 to 200 is :"+sum);
}
}
