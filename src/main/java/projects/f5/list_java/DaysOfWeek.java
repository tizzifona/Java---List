package projects.f5.list_java;

import java.util.ArrayList;
import java.util.List;

public class DaysOfWeek {
    public List<String> days;

    public DaysOfWeek() {
        createList();
    }

    public void createList() {
        days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

}
