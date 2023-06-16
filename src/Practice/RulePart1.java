package Practice;

// Until 1.4 version Return type must be same in over Riding
// From 1.5 version Co- variant Return types are allowed  // co - variant Means ( Any data type)
// co- variant Return type concept not applicable for primitives. applicable for object types

//------------------------------------------------------------------
public class RulePart1 {
	
	public Object m1() {
		return null;
		
	}                                        //1.4 Return Type must same
	
class Son extends RulePart1 {
	
	 public Object m1() {
		 return null;
	 }
}

}
//----------------------------------------------------------------------
 
class Rule {
	
	
	public Object m1() {
		return null;
		
	}                                        //1.5 Return Types are Different
	
class Son extends RulePart1 {
	
	 public String m1() {
		 return null;
	 }
}
	
}
//--------------------------------------------------------------------------

