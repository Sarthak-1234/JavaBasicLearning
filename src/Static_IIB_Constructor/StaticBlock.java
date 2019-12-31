package Static_IIB_Constructor;

public class StaticBlock {
	
	static {
		
	System.out.println("I am in static block");	
		
	}
	
	//static block it will load ---when class is loaded
	
	public static void main(String args[]) {
		System.out.println("I am in main method");
	}
	
	
	//static block will run first before any method

}
