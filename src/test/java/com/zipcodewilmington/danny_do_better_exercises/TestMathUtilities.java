package com.zipcodewilmington.danny_do_better_exercises;
import org.junit.Test;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestAddition;
//import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestDivision;
//import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestMultiplication;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestSubtraction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
  //      TestDivision.class,
    //    TestMultiplication.class
})
public class TestMathUtilities {
   /* public void testMathUtilities(){
        MathUtilities m1 = new MathUtilities();
        int test1 = m1.add(1,2);
        assertEquals(3,test1);
    }*/

}