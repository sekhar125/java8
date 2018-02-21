package com;

interface MyDefaultInterface{  
    /* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void newMethod(){  
        System.out.println("Newly added default method-Interface");  
    }  
    static void anotherNewMethod(){
    	System.out.println("Newly added static method-Interface");
    }

    /* Already existing public and abstract method
     * We must need to implement this method in 
     * implementation classes.
     */
    void existingMethod(String str);  
}  
public class DefaultMethodExample implements MyDefaultInterface{ 
	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    } 
  /* public void newMethod(){  
        System.out.println("Newly added default method- class");  
    }  */
   void anotherNewMethod(){
   	System.out.println("Newly added static method-Interface--class");
   }
    public static void main(String[] args) {  
    	DefaultMethodExample obj = new DefaultMethodExample();
    	
    	//calling the default method of interface
        obj.newMethod();   
        MyDefaultInterface.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
  
    }  
}

