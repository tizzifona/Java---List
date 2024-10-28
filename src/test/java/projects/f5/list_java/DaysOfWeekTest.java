package projects.f5.list_java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

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

}
