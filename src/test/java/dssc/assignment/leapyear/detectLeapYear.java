package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;


import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class detectLeapYear {

    @Test
    void not_multiples_of_4() {
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.isLeap(2001));
    }
}
