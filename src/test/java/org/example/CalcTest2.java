package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest2 {
    Calc c = new Calc();

    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(4,2));
    }



}
