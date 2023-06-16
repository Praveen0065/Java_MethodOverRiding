package overRidingWithStaicMethods;

// Static to non static 
// non static  to static    ARE NOT POSSIBLE


//---------------------------------------
public class Parent {
   
	public static void m1() {
		
	}
}

class child extends Parent {
	
	/*
	 * public void m1() {
	 * 
	 * }
	 */
}
//-------------------------------------

 class Parent1 {
	   
	public  void m1() {
		
	}
}

class child1 extends Parent1 {
	
	/*
	 * public static void m1() {
	 * 
	 * }
	 */
}
//-------------------------------------------