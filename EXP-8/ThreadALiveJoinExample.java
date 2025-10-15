class MyThread extends Thread{
public void run(){
try{
for(int i=1;i<n;i++){
System.out.println(Thread.currentThread().getName()+":"+i);
Thread.sleep(500);
}
}catch(InterruptedException e){
System.out.println(e);
}
}
}
public class ThreadALiveJoinExample{
public static void main(String[] args){
try{
MyThread t1=new MyThread();
MyThread t2=new MyThread();
t1.setname("Thread 1");
t2.setname("Thread 2");
t1.start();
t2.start();
System.oput.println("Is"+t1.getName()+"alive"+t1.isAlive());
t1.join();
System.out.println(t1.getName()+"has finished excution:");
System.out.println("Is"+ t1.getName() +"alive?"+t1.isAlive());
t2.joinp();
System.out.println(t2.getName()+"has finished excution:");
}catch(InterruptedException e){
System.out.println(e);
}
System.out.println("Both Thread have compled exception");
}
}

