public class SumOf1To10{
public static void main(String[] args){
int sum=0,i;
for(i=1;i<=10;i++)
{
if(i%2==0)
sum+=i;
}
System.out.println("sum of 1 to 10 is :"+sum);
}
}