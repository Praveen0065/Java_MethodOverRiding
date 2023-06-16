package Practice;

// Over Riding concepts are not applicable for private modifiers

class RulePart2 {
	
	private void m1() {
		
	}

}  
//--------------------------------------------------------

class Parent {
	 
	// If the Parent class method declares as final it can't over Ride
	
	public final void test() {
		
	}
}

//-------------------------------------------------------------
      
/*  
        final               non final          abstract          non abstract
          |                     |                 |                   |
          |                     |                 |                   |
          |                     |                 |                   |
          |  not accept         |  accept         | accept            | accept
          V                     V                 V                   V
       non final              final           non abstract          abstract  


 */

