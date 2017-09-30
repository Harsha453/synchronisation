package programs2;

class ThreadB extends Thread{
	int total =0;
	public void run(){
	synchronized(this){	System.out.println("child thread calculation strated");
		for(int i=0;i<=100;i++)
		{
			total=total+i;
	}
		this.notify();}
	}}

class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		 ThreadB b = new ThreadB();
		 b.start();
		 synchronized(b)
		 {
		 b.wait();
		 System.out.println("main thread got notified");
		 System.out.println(b.total);// TODO Auto-generated method stub

	}

}}