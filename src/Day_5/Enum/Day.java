//Define an enum Day with values for all days of the week.
//Write a program to print a message like "It's a weekday" or "It's a weekend" based on the day.

package Day_5.Enum;

public class Day
{
public enum Day1
{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}
public static void main(String args[]) {

    Day1 today = Day1.Sunday;
    switch (today) {
    case Sunday:
    System.out.println("It's a weekend");
    break;
    case Saturday:
        System.out.println("It's a weekend");
        break;
        default:
            System.out.println("It's a weekday");
    }
}
}


