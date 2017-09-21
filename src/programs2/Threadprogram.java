package programs2;
class myThread100 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("inside child thread");
		}
	}
	public void run(int i)
	{for (int j=0;j<10;j++){
		System.out.println(i);}
	}
	public void start(){
		super.start();
		for(int i=0;i<10;i++){
			
		
		System.out.println("inside start method");}
	}
}
public class Threadprogram {

	public static void main(String[] args) {
myThread100 t= new myThread100();
t.start();
t.run(5);
for(int i=0;i<10;i++)
{
	System.out.println("inside main thread");// TODO Auto-generated method stub
}

	}

}
