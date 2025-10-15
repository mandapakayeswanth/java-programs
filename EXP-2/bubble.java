import java.util.*;
public class bubble{
public static void main(String[]args){
Scanner Scanner=new Scanner(System.in);
System.out.println("enter array size:");
int size=Scanner.nextInt();
System.out.println("enter"+size+"element in the array:");
int a[]=new int[size];
for(int i=0;i<size;i++){
a[i]=Scanner.nextInt();
}
System.out.println("array before sorting");
for (int i=0;i<size;i++){
System.out.println(a[i]+"");
}
for(int i=0;i<size-1;i++){
for(int j=0;j<size-j-1;j++){
if(a[i]>a[j+1]){
int temp=a[i];
a[i]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("\n array after sorting:");
for(int i=0;i<size;i++){
System.out.println(a[i]+"");
}
Scanner.close();
}
}