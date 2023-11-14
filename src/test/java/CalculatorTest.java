import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(calc.add(-3, 4), 1);
    }

    @Test
    void dif() {
        assertEquals(calc.dif(7, 8), -1);
    }

    @Test
    void div() {
        assertEquals(calc.div(8, 3), 2);
    }

    @Test
    void divException() { // div by zero test
        assertThrows(ArithmeticException.class, () -> calc.div(9, 0));
    }

    @Test
    void times() {
        assertEquals(calc.times(2, -6), -12);
    }

    @Test
    void solver() {
        int[] result = calc.solver();
        assertEquals(result[0], 3);
        assertEquals(result[1], -2);
    }
}