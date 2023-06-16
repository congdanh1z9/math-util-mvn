/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.giaolang.mathutil.core;

/**
 *
 * @author ROG
 */
//class nay clone giong class java.util.Math
//chua cac ham static Math.sqrt(), .sin, .random()
public class MathUtility {
    
    public static final double PI = 3.1415;
    // ham getF la ham tinh  n! = 123..n
    //thiet ke ham nhu sau
    //0! = 1! = 1
    //ko cos giai thua cho so am . Neu dua -5 -> Chửi : ném ra exeption
    //vì giai thua tang rat nhanh , 21! long ko chua đủ (long = 18 số 0)
    //// 21! 22! 23! -> chửi.
    
    public static long getFactorial(int n){
        if(n < 0 || n> 20)
            throw new IllegalArgumentException("Invalid m . n must be between 0...20, plz");
        
        if(n == 1 || n == 1)
            return 1;
        long product = 1;//bien luu don cac tich
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }
}
//Code đang sẽ code sẽ tiến hành ngay việc kiểm thử 
// viết code tới đâu cí kiểm thử tới đó để đảm bảo code ngon :--> TDD  : Test Drivent Develepment
