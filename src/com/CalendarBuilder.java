package com;

//Before JDK 1.8, each date field is set separately with individual methods. Each set method added as a separate statement. See the calendar instance in the following code.


import java.util.Calendar;
import static java.util.Calendar.*;      

public class CalendarBuilder
{ 
  public static void main(String args[]) 
  {
    Calendar calendar = Calendar.getInstance();
// populate calendar with individual set methods one-by-one as a separate statement
    calendar.set(YEAR, 2013);
    calendar.set(MONTH, APRIL);
    calendar.set(DATE, 10);
    calendar.set(HOUR, 8);
    calendar.set(MINUTE, 56);
    calendar.set(SECOND, 14);
    calendar.set(AM_PM, PM);

    System.out.println(calendar.getTime());

                                           // let us see the JFK 1.8 style
                                     // all set methods are set as one statement

    Calendar calendar1 = new Calendar.Builder()
                         .set(YEAR, 2013)
                         .set(MONTH, APRIL)
                         .set(DATE, 10)
                         .set(HOUR, 8)
                         .set(MINUTE, 56)
                         .set(SECOND, 14)
                         .set(AM_PM, PM)
                         .build();         // one semicolon here

    System.out.println(calendar1.getTime());
  }
}
