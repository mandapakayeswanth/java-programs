import java.util.*;
public class binary{
public static void main(String[]args){
Scanner S=new Scanner(System.in);
System.out.println("enter array size");
int size=S.nextInt();
System.out.println("enter"+size+"element in the array:");
int a[]=new int[size];
for(int i=0;i<size;i++){
a[i]=S.nextInt();
}
System.out.println("enter the element to search:");
int key=S.nextInt();
int low=0,high=size-1,mid,f=0;
while(low<high){
mid=(low+high)/2;
if(a[mid]==key){
f=1;
System.out.println("element found at index:"+mid);
break;
}
else
{
if(key>a[mid]){
low=mid+1;
if(key<a[mid]){
high=mid-1;
}
}
if(f==0){
System.out.println("elemnt not found in the array");
}
}
S.close();
}
}
}