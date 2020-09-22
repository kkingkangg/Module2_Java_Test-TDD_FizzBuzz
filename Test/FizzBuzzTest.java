import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void isFizzBuzz1() {
        String expected = "Fizz";
        String actual = FizzBuzz.isFizzBuzz(6);
        assertEquals(expected,actual);
    }

    @Test
    void isFizzBuzz2() {
        String expected = "Buzz";
        String actual = FizzBuzz.isFizzBuzz(5);
        assertEquals(expected,actual);
    }

    @Test
    void isFizzBuzz3() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.isFizzBuzz(15);
        assertEquals(expected,actual);
    }

    @Test
    void isFizzBuzz4() {
        String expected = "8";
        String actual = FizzBuzz.isFizzBuzz(8);
        assertEquals(expected,actual);
    }

    @Test
    void isFizzBuzz5() {
        String expected = "Fizz";
        String actual = FizzBuzz.isFizzBuzz(23);
        assertEquals(expected,actual);
    }

    @Test
    void isFizzBuzz6() {
        String expected = "Buzz";
        String actual = FizzBuzz.isFizzBuzz(56);
        assertEquals(expected,actual);
    }
}