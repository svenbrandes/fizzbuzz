package de.volkswagen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests{

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void canStartFizzBuzz() {
        assertNotNull(fizzBuzz);
    }

    @Test
    void numDivByThree_rtnFizz() {
        String expected = "Fizz";
        String actual = fizzBuzz.convert(3);
        assertEquals(expected, actual);

    }

    @Test
    void numDivByFive_rtnBuzz() {
        String expected = "Buzz";
        String actual = fizzBuzz.convert(5);
        assertEquals(expected, actual);
    }

    @Test
    void numbDivByThreeAndFive_rtnFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = fizzBuzz.convert(15);
        assertEquals(expected, actual);
    }

    @Test
    void numNotDivByThreeOrFive_rtnNum() {
        String expected = "4";
        String actual = fizzBuzz.convert(4);
        assertEquals(expected, actual);
    }

}