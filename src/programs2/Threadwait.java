package programs2;
class thread45 extends Thread{
	public void run(){
	for(int i=0;i<10;i++){	System.out.println("inside child");
		try{Thread.sleep(2000);}
		catch(InterruptedException ie)
		{
			System.out.println("thread interrupted");
		}}
	}
}
public class Threadwait {

	public static void main(String[] args) throws InterruptedException {
		thread45 t = new thread45();
		t.start();
		//t.join(10000);
		for(int i=0;i<10;i++)
		{
			System.out.println("inside main");
		}
	// TODO Auto-generated method stub

	}

}
