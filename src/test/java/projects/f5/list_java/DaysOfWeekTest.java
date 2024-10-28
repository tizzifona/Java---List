package projects.f5.list_java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {

    DaysOfWeek daysOfWeek = new DaysOfWeek();

    @Test
    void testCreateList() {
        assertThat(daysOfWeek.days.size(), is(7));
    }

    @Test
    void testGetDays() {
        assertThat(daysOfWeek.getDays().size(), is(7));
        assertThat(daysOfWeek.getDays(), containsInAnyOrder(
                "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"));
    }

    @Test
    void testGetListSize() {
        assertThat(daysOfWeek.getListSize(), is(7));
    }

    @Test
    void testRemoveDay() {
        assertThat(daysOfWeek.getDays().contains("Monday"), is(true));
        daysOfWeek.removeDay("Monday");
        assertThat(daysOfWeek.getDays().contains("Monday"), is(false));
        assertThat(daysOfWeek.getListSize(), is(6));
    }

    @Test
    void testGetDay() {
        assertThat(daysOfWeek.getDay(0), is("Monday"));
        assertThat(daysOfWeek.getDay(2), is("Wednesday"));
        assertThat(daysOfWeek.getDay(6), is("Sunday"));
        assertThat(daysOfWeek.getDay(7), is(nullValue()));
    }

    @Test
    void testContainsDay() {
        assertThat(daysOfWeek.containsDay("Monday"), is(true));
        assertThat(daysOfWeek.containsDay("BirthDay"), is(false));
    }

}
