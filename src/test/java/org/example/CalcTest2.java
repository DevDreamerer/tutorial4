package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest2 {
    Calc c = new Calc();
    @Test
    void testSubtraction (){
        assertEquals(2, c.subtract(4,2));
    }
}
