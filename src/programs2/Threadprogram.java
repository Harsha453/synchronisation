package programs2;
class myThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("inside child thread");
		}
	}
}
public class Threadprogram {

	public static void main(String[] args) {
myThread t= new myThread();
t.start();
for(int i=0;i<10;i++)
{
	System.out.println("inside main thread");// TODO Auto-generated method stub
}

	}

}
