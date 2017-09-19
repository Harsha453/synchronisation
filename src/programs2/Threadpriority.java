package programs2;
class Thread35 extends Thread{
	
}
public class Threadpriority {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
Thread35 t = new Thread35();
System.out.println(t.getPriority());
// TODO Auto-generated method stub

	}

}
