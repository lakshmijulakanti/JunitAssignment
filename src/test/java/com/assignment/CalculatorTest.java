package com.assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    double firstValue = 60.0;
    double secondValue = 30.0;

    @BeforeEach
    void Setup(){

        System.out.println("This is a Calculator test");
    }
    @Test
    @Order(1)
    void testSetFirstValue(){
        double firstValue = 60.0;
        calculator.setFirstValue(firstValue);
        assertEquals(60.0,calculator.getFirstValue());
    }
    @Test
    @Order(2)
    void testSetSecondValue(){
        double secondValue = 70.0;
        calculator.setSecondValue(secondValue);
        assertEquals(70.0,calculator.getSecondValue());
    }
    @Test
    @Order(3)
    void testSetResult(){
        double result = 130.0;
        calculator.setResult(result);
        assertEquals(130.0,calculator.getResult());
    }
    @Test
    @Order(4)
    void testAdditionExecute(){
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        double add = calculator.execute('a');
        assertEquals(90.0,add);
    }
    @Test
    @Order(5)
    void testSubtractExecute(){
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        double sub = calculator.execute('s');
        assertEquals(30.0,sub);
    }
    @Test
    @Order(6)
    void testMultiplyExecute(){
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        double mul = calculator.execute('m');
        assertEquals(1800.0,mul);
    }
    @Test
    @Order(7)
    void testDivisionExecute(){
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        double div1 = calculator.execute('d');
        assertEquals(2.0,div1);
    }
    @Test
    @Order(8)
    @DisplayName("This is the test for the second option in division")
    void testDivExecute(){
        calculator.setFirstValue(50.0);
        calculator.setSecondValue(0.0);
        double div2 = calculator.execute('d');
        assertEquals(0.0d,div2);
    }

    @Test
    @Order(9)
    @DisplayName("This is the test to check the default case")
    void testInvalidOpcode(){
        double res = calculator.execute('h');
        assertEquals(0.0d,res);
    }
}