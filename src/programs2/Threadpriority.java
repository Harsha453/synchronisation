package programs2;
class Thread3 extends Thread{
	
}
public class Threadpriority {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
Thread3 t = new Thread3();
System.out.println(t.getPriority());
// TODO Auto-generated method stub

	}

}
