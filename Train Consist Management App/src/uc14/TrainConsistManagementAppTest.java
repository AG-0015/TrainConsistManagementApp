package uc14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UC14Test {

    @Test
    void testException() {
        assertThrows(Exception.class, () -> new uc14.PassengerUnit(0));
    }
}