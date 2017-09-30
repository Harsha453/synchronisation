package programs2;
class myythreadd extends Thread{
	
	public void run(){
		System.out.println("child thread");
	}
}
public class Daemonthread {

	public static void main(String[] args) {
		try{System.out.println(Thread.currentThread().isDaemon());// TODO Auto-generated method stub
myythreadd t = new myythreadd();
System.out.println(t.isDaemon());
t.setDaemon(true);
System.out.println(t.isDaemon());
t.start();}


	
	finally{System.out.println("this is finally");}}

}
