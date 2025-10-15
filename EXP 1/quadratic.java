import java.util.Scanner;
public class quadraticroots{
public static void main (String [] args){
Scanner Sc=new Scanner (System.in);
System.out.print("enter value of a:");
double a=Sc.nextDouble();
System.out.print("enetr value of b:");
double b=Sc.nextDouble();
System.out.print("eneter value of c:");
double c=Sc.nextDouble();
double d=b*b-4*a*c;
if(d>0){
double root1=(-b+Math.sqrt(d))/(2*a);
double root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("roots are real and different:");
System.out.println("roots1="+root1);
System.out.println("roots2="+root2);
}else if(d==0){
double root=-b/(2*a);
System.out.println("roots are real and equal");
System.out.println("root="+root);
}else{
double realpart=-b/(2*a);
double imagpart=Math.sqrt(-d)/(2*a);
System.out.println("roots are complex and differnt");
System.out.println("root1="+realpart+"+"+"imagpart");
System.out.println("root2="+realpart+"-"+"imagpart");
}
Sc.close();
}
} 