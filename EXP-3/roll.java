import java.util.*;
class ITC1 {
int rollnumber;
string name;
void details()
{
System.out.println("name:"+name);
System.out.println("rollnumber:"+rollnumber);
}
public static void main(String[]args){
ITC1 y=new ITC1();
y.name="siva";
y.rollnumber="24481a12h6";
y.details();
ITC1 m=new ITC1();
m.name="mahesh";
m.rollnumber="24481A12F5";
m.details();
}