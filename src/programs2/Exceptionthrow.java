package programs2;
import java.util.Scanner;

public class Exceptionthrow {

	public static void main(String[] args) throws NumberFormatException {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the marks");
		 String marks= sc.nextLine();
		 
		
			 int m = Integer.parseInt(marks);
			
			 System.out.println("marks are "+m);
			 throw new NumberFormatException("enter numbers only");// TODO Auto-generated method stub
		 
		 

	}

}
