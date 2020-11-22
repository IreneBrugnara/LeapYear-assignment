package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;


import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class detectLeapYear {

    @Test
    void not_divisible_by_4() {
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.isLeap(2001));
    }

    @Test
    void divisible_by_4_not_100_nor_400() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeap(1996));
    }

}
