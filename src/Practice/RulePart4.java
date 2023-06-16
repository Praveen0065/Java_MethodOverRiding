package Practice;

// if child class throws any checked exceptions 
//parent class also same throws same checked exception
// unchecked exceptions there is no rule
//------------------------------------------------------------------
public class RulePart4 {
	
	public void m1()  throws Exception
	{
		
	}
                      // if the child does'nt throws any checked exception the code is compile
}
class sonTest  extends RulePart4 {
	
	public void m1() {
		
	}
	
}
//---------------------------------------------------------------------

class demo {
	
	public void m1()  
	{
		
	}
                      // if the child  throws any checked exception compulsory parent have the
	                  // same checked exception 
}
class jump  extends demo {
	
	/*
	 * public void m1() throws Exception {
	 * 
	 * }
	 */
	
}
//-----------------------------------------------------------------------------