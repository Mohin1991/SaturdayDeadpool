package com.upskill.java_5;

public interface Interface {

	public abstract void iDoor ();
	// Interface can have only abstract methods, java 8 and forward they have static method too 
	
		// Abstract method doesn't have any implementation 
		

	 public abstract int iBus ();
			 
     public abstract String iTruck ();
			 
}
/* (Parent)          (Keyword)       (Child)              (Keyword)      (Grandchild)
Class                extends          Class
Abstract class(+2)       extends          class(-2)
Interface(+2)            Implements       Class(-2)
Interface (+2)           Extends         Interface (+2)    implements           class-4)

*/
