
package org.congdanh.mathutil.core.test;

import org.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilityAdvancedTest {
    
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {4,24},
                               {6,720}};
        
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testfactorialGivenRightArgment(int n , long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
