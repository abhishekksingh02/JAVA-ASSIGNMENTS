package core_Java;

public class Module2Ex23 {
     class A1
     {
    	 void print_msg() 
        {
    		System.out.println("This is Parent Class.");
    	}
     }
     class B1 extends A1
     {
    	  void print_msg2() 
    	 {
    		 System.out.println("This is Child Class.");
    	 }
     }
     public static void main(String[] args) {
		 
    	 B1 b = new B1();
    	 b.print_msg();
    	 b.print_msg2();
    	 
	}
}
