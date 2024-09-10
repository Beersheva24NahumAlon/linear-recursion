package telran.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static telran.util.RecursionMethods.*;

public class RecursionMethodsTest {
    @Test
    void fTest() {
        f(20000);
    }

    @Test
    void factorialTest() {
        assertEquals(1, factorial(0));
        assertEquals(1 * 2 * 3 * 4, factorial(4));
        assertEquals(1 * 2 * 3 * 4 * 5, factorial(5));
        assertEquals(1 * 2 * 3 * 4 * 5, factorial(-5));
    }

    @Test
    void powTest() {
        assertEquals(125, pow(5, 3));
        assertEquals(16, pow(2, 4));
        assertEquals(-125, pow(-5, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> assertEquals(16, pow(2, -4)));
    }

    @Test
    void sumTest() {
        assertEquals(6, sum(new int[] { 1, 2, 3 }));
        assertEquals(0, sum(new int[] {}));
        assertEquals(0, sum(new int[] { 0, 0, 0 }));
    }

    @Test
    void multiplicationTest() {
        assertEquals(25, multiplication(5, 5));
        assertEquals(6, multiplication(-2, -3));
        assertEquals(-6, multiplication(2, -3));
        assertEquals(-6, multiplication(-2, 3));
        assertEquals(6, multiplication(2, 3));
    }

    @Test
    void squareTest() {
        assertEquals(25, square(5));
        assertEquals(625, square(25));
        assertEquals(625, square(-25));
    }

    @Test
    void isSubstringTest() {
        assertTrue(isSubstring("Hello world", "llo "));
        assertFalse(isSubstring("Hello world", " llo"));
    }
}
