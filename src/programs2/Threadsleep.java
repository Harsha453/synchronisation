package programs2;
class mythread55 extends Thread{
	static Thread mt;
	public void run()  {
		for (int i=0;i<10;i++)
		{
			System.out.println("inside child");try{Thread.sleep(3000);}catch(InterruptedException ie){System.out.println("interrupted");}
			
		}
	}
}
public class Threadsleep {

	public static void main(String[] args) throws InterruptedException {
		mythread55.mt = Thread.currentThread();
		mythread55 m = new mythread55();
		m.start();
		m.interrupt();
		
		

	}

}
