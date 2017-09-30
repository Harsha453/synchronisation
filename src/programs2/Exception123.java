package programs2;

public class Exception123 {
	

		public static void main(String[] args) {
			
			try{
				String s1 ="10";
			int x=Integer.parseInt(s1);
			
			
			int y =0;
				 int z =x/y;
				System.out.println("the divison is "+z);// TODO Auto-generated method stub
			}
				catch(Exception ae)
				{
					
			System.out.println(ae.getMessage());
			 ae.printStackTrace();}
				
				finally{
					System.out.println("inside finally");
					
					
				}
			
				System.out.println("after finally");

		}

	}

