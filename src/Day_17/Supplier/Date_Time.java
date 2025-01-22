//Simple Supplier Write a Java program to use a Supplier that returns the current date and time.

package Day_17.Supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.function.Supplier;

public class Date_Time {
        public static void main(String[] args) {
            Supplier<LocalDate> supplier=()-> LocalDate.now();
            LocalDate localDate=supplier.get();
            System.out.println("Current Date  :"+localDate);
            Supplier<LocalTime> supplier1=()-> LocalTime.now();
            LocalTime localTime=supplier1.get();
            System.out.println("Current Time  :"+localTime);
        }
}
