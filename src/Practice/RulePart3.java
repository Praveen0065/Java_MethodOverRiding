package Practice;

//public having the more access           private < default < protected < public

// least having private

// we can't reduce the scope
// increasing the scope it is acceptable

//-------------------------------------------------------------------------
public class RulePart3 {  
	
	public void test() {
		System.out.println( "public method");
	}

}
class Sun extends RulePart3 {         
	
	/*                                     //Not possible
	 * protected void test() {             // because of reducing the scope
	 *   
	 * }
	 */
}
//--------------------------------------------------------------------------
class taste {  
	
	protected void test1() {
		
		System.out.println( "public method");
	}

}
class food extends taste {         
	
	                                     //possible
	  public void test1() {             // because of Increasing the scope
	   
	  }
	 
}
//-----------------------------------------------------------------------