package ExceptionHandlinePractice;

import javax.security.auth.kerberos.KerberosKey;

public class BasicProg {
	
	//pin ---1234
	//neither got money ---nor any message
	
	
	//aapka program chalta rahe..jab b koi error aati h
	
	
//	Exception ------------Error
//	1. Compile time
//	2. Run time exception - ArithmeticException
	
	
	public static void main(String args[]) {
		
		
		System.out.println("Welcome to atm");
		System.out.println("Enter pin");
		
//		try {
//		int i = 10/0;
//		System.out.println(i);
//		
//		
//		
//		} catch(ArithmeticException e) {
//			e.printStackTrace();
//			
//			System.out.println("Please take your card");
//		} 
		
		
		//arrays = length
		//arraylist = size
	
		try {
		
		int arr[] = new int[2];
		
	
		for(int j=0;j<arr.length;j++) {
			System.out.println(20/arr[5]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		} 
		catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		}  
		
	
		
		//weird situation ---uske bad ka prog nhi chalta
		
		System.out.println("Sorry please take money - multiple of 2000");
		
//		Exception ----
//		Error --------
		
		
//		1. can we write try without catch??
//	    2.Mutliple catches?
		//3. if Exception class is written in 1st catch block?? it will compile time error
		
		
	}
	
	
	

}
