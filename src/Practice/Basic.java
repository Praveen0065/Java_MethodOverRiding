package Practice;


// WhatEver the parent as by Default all will get
// to the child class // when the child is not satisfied with 
// parent method implementation
// Then the child as Redefines the method called as overRiden


//** In Over riding Method Resolution always takes care by JVM Based on Runtime object
//** Not Based On Reference Type

public class Basic {
	
	public void Property() {
		System.out.println("Land-Gold-House-Cash");
	}
	public void marry() {
		
		System.out.println("Anushka");
		
	}                                      
}

class Son extends Basic {
	
	public void marry() {
		System.out.println("Nivetha Thomas");
	}
} 

class OverBasicMain {
	public static void main(String[] args) {
//		           ______________
//	   Basic b1 = | new Basic(); | ------> Run Time Object
//		          ---------------- 
		
		Basic b1 = new Basic();
		b1.marry();                // Parent method
		
	    Son s1  = new Son();
	    s1.marry();               // Child Method
	    
	    Basic b2 = new Son();
	    b2.marry();                // Child Method
	         
	}
}