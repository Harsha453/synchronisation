package programs2;
class MyThread2 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("inside child ");}
	}
}
public class Threadrunnable {

	public static void main(String[] args) {
		MyThread2 m = new MyThread2();
		Thread t=new Thread(m);
		System.out.println(t.getName());
		Thread t1=new Thread();
		t.start();
		t1.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("harsha");
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println("inside main");// TODO Auto-generated method stub
		}

	}

}
