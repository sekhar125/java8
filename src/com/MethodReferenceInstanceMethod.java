package com;

@FunctionalInterface 
interface MyInterface{  
    void display();
    
}  
public class MethodReferenceInstanceMethod {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public void myMethod2(){  
    	System.out.println("ksdhfksdh Method");  
        }  
        
    public static void main(String[] args) {  
    	MethodReferenceInstanceMethod obj = new MethodReferenceInstanceMethod();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}
