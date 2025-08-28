import java.util.Scanner;
public class ProfitLoss{
public static void main(String[] args){
float cp,sp;
double l,p;
Scanner sc=new Scanner(System.in);
System.out.println("enter cost price");
cp=sc.nextFloat();
System.out.println("enter selling price");
sp=sc.nextFloat();
if(sp>cp){
p=sp-cp;
System.out.println("profit is "+p);
}
else if(cp>sp){
l=cp-sp;
System.out.println("loss is "+l);
}
else{
System.out.println("no profit no loss");
}
}
}
