package programs2;

class ThreadB extends Thread{
	int total =0;
	public void run(){
		for(int i=0;i<100;i++)
		{
			total=total+i;
	}
	}}

class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		 ThreadB b = new ThreadB();
		 b.start();
		 Thread.sleep(1000);
		 System.out.println(b.total);// TODO Auto-generated method stub

	}

}