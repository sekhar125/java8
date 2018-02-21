package com;

import java.util.Arrays;
//1. Method References

// With static method:


class Test1 
{
  public static int matchStringLength(String str1, String str2)
  {
    return str1.length() - str2.length();
  }
}
public class MethodReference 
{
  public void printByStringLength() 
  {
    String names[] = {"abcde","abc","ab","abcd", "a"};
    Arrays.sort(names, Test1::matchStringLength);
        
    System.out.println(Arrays.toString(names));
    } 
    public static void main(String args[])
    {
        new MethodReference().printByStringLength();
   }
}    
