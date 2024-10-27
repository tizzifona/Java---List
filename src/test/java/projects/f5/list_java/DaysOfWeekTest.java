package projects.f5.list_java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {

    @Test
    void testCreateList() {

        DaysOfWeek daysOfWeek = new DaysOfWeek();
        assertThat(daysOfWeek.days.size(), is(7));

    }

}
