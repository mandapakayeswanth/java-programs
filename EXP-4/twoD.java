import java.util.*;
class twoD {
public static void main(String args[]){
Scanner S=new Scanner(System.in);
int row,col;
System.out.println("enter row size:");
row=S.nextInt();
System.out.println("enter column size:");
col=S.nextInt();
int[][]arr=new int [row][col];
System.out.println("you've entered:");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
arr[i][j]=S.nextint();
}
}
System.out.println("enter row size:");
row=S.nextint();
System.out.println("enter column size:");
col=S.nextint();
int[][]arr1=new int [row][col];
System.out.println("you've entered %d column,enter the %d elements:");
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr1.length;j++){
arr[i][j]=S.nextint();
}
}
System.out.println("array1 elements are:");
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr1.length;j++){
System.out.println(arr[i][j]+"");
}
System.out.println();
}
system.out.println("enter row size:");
row=S.nextint();
System.out.println("enter column size:");
col=S.nextint();
int[][]arr2=new int [row][col];
System.out.println("you've entered %d column,enter the %d elements:");
for(int i=0;i<arr2.length;i++){
for(int j=0;j<arr2.length;j++){
arr[i][j]=S.nextint();
}
}
System.out.println("array2 elements are:");
for(int i=0;i<arr2.length;i++){
for(int j=0;j<arr2.length;j++){
System.out.println(arr[i][j]+"");
}
System.out.println();
}
if(arr[0].length!=arr.length){
System.out.println("matrix multiplication not possible:");
}else {
int[][] product=new int[arr.length][arr1[0].length];
for(int i=0;i<arr2.length;i++){
for(int j=0;j<arr2.length;j++){
product[i][j]=0;
for(int k=0;k<arr[0].length;k++){
product[i][j]+=arr[i][k]*arr1[k][j];
}
}
}
}
System.out.println("product of array1 and array2 is:");
for(int i=0;i<product.length;i++){
for(int j=0;j<product[0].length;j++){
System.out.println(product[i][j]+"");
}
System.out.println();
}
S.close();
}
