package Constructorss;

public class basicconstructor {
	
	//1. When we create object --by default constructor is called
	//2. No return type
	//3. Same as class name
	
	//by default constructor
	
	public basicconstructor() {
		System.out.println("I am constructor");
	}
	
	public basicconstructor(String value) {
		System.out.println("I am parametrized constructor --value = " +value);
	}
	
	
	//1. agar koi bhi constructor present nhi hai ---??
	//no error is found...Object Class by default constructor bna deti hai class ke ander..but kuch print nhi karti
	//if no constructor --parent class constructor is present
	
	//what is the parent class of all classes? Ans - Object class
	
	//2. basicconstructor() can we careate function same as class name??
	//it works find as normal function. but it will show warning message
			
	public void basicconstructor() {
		System.out.println("basic constructor method");
	}
}
