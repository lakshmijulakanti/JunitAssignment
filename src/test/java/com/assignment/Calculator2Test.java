package com.assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {
    Calculator2 calculator2 = new Calculator2();
    @BeforeEach
    void setup(){

        System.out.println("This is a calculator test");
    }
   /* @Test
    void testAdd(){
        assertEquals(3,calculator2.add(1,2));
    }
    @Test
    void testSub(){
        assertEquals(1,calculator2.subtract(2,1));
    }
    @Test
    void testMul(){
        assertEquals(6,calculator2.multiply(2,3));
    }
    @Test
    void testDiv(){
        assertEquals(5,calculator2.divide(10,2));
    }
    @Test
    void testReverse(){

        assertEquals("tac",calculator2.reverse("cat"));
    }*/
    @Test
    void testQuote(){
        String str = calculator2.quote();
        System.out.println(str);
            assertNotNull(str);
            assertTrue(str.contains("We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein")
                    || str.contains("A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare")
                    || str.contains("You must be the change you wish to see in the world. - Mahatma Gandhi")
                    || str.contains("In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.")
                    || str.contains("Choose a job you love, and you will never have to work a day in your life. - Confucius")
                    || str.contains("To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde")
                    || str.contains("Without music, life would be a mistake. - Friedrich Nietzsche")
                    || str.contains("I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams"));

    }
    @Test
    void testGetCounter(){
        calculator2.add(1,2);
        calculator2.subtract(5,3);
        calculator2.multiply(5,2);
        calculator2.divide(10,5);
        calculator2.reverse("cat");
        calculator2.quote();
        assertEquals(7,calculator2.getCounter());
    }

}