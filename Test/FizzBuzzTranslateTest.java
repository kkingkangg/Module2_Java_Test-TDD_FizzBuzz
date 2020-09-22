import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void readMoreThan101() {
        String expected = "muoi ba";
        String actual = FizzBuzzTranslate.readMoreThan100(13);
        assertEquals(expected,actual);
    }

    @Test
    void readMoreThan102() {
        String expected = "hai muoi mot";
        String actual = FizzBuzzTranslate.readMoreThan100(21);
        assertEquals(expected,actual);
    }

    @Test
    void readMoreThan103() {
        String expected = "tam";
        String actual = FizzBuzzTranslate.readMoreThan100(8);
        assertEquals(expected,actual);
    }

    @Test
    void readMoreThan104() {
        String expected = "tam muoi tam";
        String actual = FizzBuzzTranslate.readMoreThan100(88);
        assertEquals(expected,actual);
    }

    @Test
    void readMoreThan105() {
        String expected = "muoi sau";
        String actual = FizzBuzzTranslate.readMoreThan100(16);
        assertEquals(expected,actual);
    }

    @Test
    void readMoreThan106() {
        String expected = "Ngoài giới hạn";
        String actual = FizzBuzzTranslate.readMoreThan100(101);
        assertEquals(expected,actual);
    }



}