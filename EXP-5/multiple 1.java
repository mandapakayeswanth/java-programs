interface A{
void show();
}
inetrface B{
void display();
}
class C implement A,B{
public void show(){
system.out.println("showable");
}
public void display(){
system.out.println("printable");
}
}
class multiple1{
public static void main(Sting args[]){
C obj=new C();
obj.show();
obj.display();
}
}
