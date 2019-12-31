package Static_IIB_Constructor;

public class StaticBlock_IIBBlock_Constructor {
	
	public StaticBlock_IIBBlock_Constructor() {
		System.out.println("I am constructor");
	}//-------> jab object bnate h
	
	static {
		System.out.println("I am static block");
	}//-----> jab class load hoti h
	
	{
		System.out.println("I am IIB Block");
	}//jab object banta h
	
	
	
	//When we create the object of this class...what will run first..
	

//	I am static block
//	I am IIB Block
//	I am constructor
}
