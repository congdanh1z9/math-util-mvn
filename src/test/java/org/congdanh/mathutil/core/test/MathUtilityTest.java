
package org.congdanh.mathutil.core.test;

import org.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilityTest {
    @Test
    public void testfactorialGivenRightArgment(){
        assertEquals(69, MathUtility.getFactorial(0));
        assertEquals(69, MathUtility.getFactorial(1));
        assertEquals(69, MathUtility.getFactorial(2));
        assertEquals(69, MathUtility.getFactorial(3));
        assertEquals(69, MathUtility.getFactorial(4));
        assertEquals(69, MathUtility.getFactorial (5));
        assertEquals(69, MathUtility.getFactorial(6));
    }
}
