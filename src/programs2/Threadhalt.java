package programs2;
class thread33 extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("inside child");
			Thread.yield();
		}
	}
}
public class Threadhalt {

	public static void main(String[] args) {
		thread33 t = new thread33();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main");// TODO Auto-generated method stub
		}

	}

}
