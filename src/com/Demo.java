package com;

import java.util.Arrays;
class Test 
{
  public static int matchStringLength(String str1, String str2)
  {
    return str1.length() - str2.length();
  }
}
public class Demo 
{
  public void printByStringLength() 
  {
    String names[] = {"abcde","abc","ab","abcd", "a"};
    Arrays.sort(names, Test::matchStringLength);
        
    System.out.println(Arrays.toString(names));
    } 
    public static void main(String args[])
    {
        new Demo().printByStringLength();
   }
}      