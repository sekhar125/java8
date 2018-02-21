package com;

@FunctionalInterface 
interface MyInterface1{  
    Hello display(String say, String say2);  
}  
class Hello{  
    public Hello(String say, String s2){  
        System.out.print(say+s2);  
    }
    public Hello(String say){  
        System.out.print(say);  
    }
}  
public class MethodReferenceConstructor {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface1 ref = Hello::new;  
        ref.display("Hello World!","test");
        
    }  
}
