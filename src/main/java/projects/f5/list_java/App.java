package projects.f5.list_java;

public class App {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();

        System.out.println("List of days of the week: " + daysOfWeek.getDays());

        System.out.println("List size: " + daysOfWeek.getListSize());

        String checkDay = "Tuesday";
        System.out.println("Does the list contain " + checkDay + "? " + daysOfWeek.containsDay(checkDay));

        int index = 3;
        System.out.println("Day of the week at position " + index + ": " + daysOfWeek.getDay(index));

        String dayToRemove = "Monday";
        System.out.println("Removing day: " + dayToRemove);
        daysOfWeek.removeDay(dayToRemove);
        System.out.println("List after removing " + dayToRemove + ": " + daysOfWeek.getDays());
        System.out.println("List size after removal: " + daysOfWeek.getListSize());

        System.out.println("Sorting the list alphabetically:");
        daysOfWeek.sortDaysAlphabetically();
        System.out.println("Sorted list: " + daysOfWeek.getDays());

        System.out.println("Clearing the list");
        daysOfWeek.clearList();
        System.out.println("List after clearing: " + daysOfWeek.getDays());
        System.out.println("List size after clearing: " + daysOfWeek.getListSize());
    }
}
