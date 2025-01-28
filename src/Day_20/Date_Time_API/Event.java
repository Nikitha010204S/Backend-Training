//Use Date and Time API, Factory Methods, and Streams to build a simple scheduling system.
//Create a class Event with fields name, dateTime, and duration.
//Create a list of events using List.of().
//Provide the following functionality:

//Display all events.
//Filter events based on a specific date.
//Calculate the duration between events using Duration.between.

//Example Input:
//Events:
//"Meeting", 2025-01-28T10:00, 1 hour
//"Workshop", 2025-01-28T13:00, 2 hours

//Example Output:
//Events on 2025-01-28:
//"Meeting"
//"Workshop"


package Day_20.Date_Time_API;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Event {
    private String name;
    private LocalDateTime datetime;
    private Duration duration;

    public Event(String name, LocalDateTime datetime, Duration duration) {
        this.name=name;
        this.datetime=datetime;
        this.duration=duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " ," + datetime + " ," + duration.toHours()+ " hours";
    }

    public static void main(String args[]) {
        List<Event> events = List.of(
                new Event("Meeting", LocalDateTime.of(2025, 1, 28, 10, 0), Duration.ofHours(1)),
                new Event("Workshop", LocalDateTime.of(2025, 1, 28, 13, 0), Duration.ofHours(2))
        );
        System.out.println("Events :");
        events.forEach(System.out::println);
        System.out.println();


        LocalDateTime Filter_date=LocalDateTime.of(2025, 1, 28, 13, 0);
        System.out.println("Events on "+Filter_date.toLocalDate()+ " :");
        events.stream().filter(event -> event.getDatetime().toLocalDate().equals(Filter_date.toLocalDate())).forEach(event -> System.out.println(event.getName()));
        System.out.println();

        System.out.println("Duration between events:");
        Event meeting = events.get(0);
        Event workshop = events.get(1);
        Duration duration_btw_two = Duration.between(meeting.getDatetime(), workshop.getDatetime());
        System.out.println(duration_btw_two.toHours() + " hours");
        System.out.println();


    }
}
