package com;

//2. Parallel Sort


import java.util.Arrays;
public class ParallelSort
{
  public static void main(String args[])
  {
    String fruits[] = {"guava","apple","banana"};
    String fruits1[] = {"guava","apple","banana"};

                                      // before JDK 1.8, using Arrays.sort()

    Arrays.sort(fruits);
    System.out.println(Arrays.toString(fruits));

                                       // with JDK 1.8, using Arrays.parallelSort()
    Arrays.parallelSort(fruits1);
    System.out.println(Arrays.toString(fruits1));
  }
}    
