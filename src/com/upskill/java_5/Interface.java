package com.upskill.java_5;

public interface Interface {
	
	//interface can have only abstract method , java8 and forward they have static method to
	// abstract method does't have any implementation
	

	public abstract void iDoor();
	public abstract int iWheel();
	public abstract void iSeat();
	
	public abstract String iColor();
	
	/*
    (Parent)				   (Keyword) 				(Child)					 (Keyword) 					(GrandChild)
    						
	Class(0)				extends					 Class(0)		 
	Abstract Class(4)		extends					 Class(4-4=0)
	Interface(4) 			 implements				 Class(4-4=0)                
	Interface(4)				 extends			 Interface(4+4=8)               implement	               Class(8-8=0 )
	Interface 		  									Abstract Class
	Abstract Class 		 								Interface   												Class	
*/
	
	
}
