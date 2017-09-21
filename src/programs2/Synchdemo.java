package programs2;
class Display{
	public static synchronized  void  wish(String name){
		{ for(int i=0;i<10;i++){
			System.out.print(name+" ");
			try{Thread.sleep(2000);}catch(InterruptedException ie){System.out.println("interrupted");}
			System.out.println("good morning");}
		}
		
	}
}
class mythread67 extends Thread{
	String name;
	Display d;
	mythread67(String name, Display d)
	{
		this.name= name;
		this.d=d;
	}
	public void run(){
		d.wish(name);
	}
	
}
public class Synchdemo {

	public static void main(String[] args) {
		Display d = new Display();
		Display d1=new Display();
		mythread67 m = new mythread67("harsha",d);
		mythread67 m2 = new mythread67("dhoni",d1);
		m.start();
		m2.start();// TODO Auto-generated method stub

	}

}
