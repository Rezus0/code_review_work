import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  
    private static Calculator calculator;

    @BeforeAll
    public static void initAll() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(calculator.add(-3, 4), 1);
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(15, 5));
        assertEquals(calculator.dif(7, 8), -1);
    }

    @Test
    void div() {
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0)); // div by zero test
        assertEquals(calculator.div(8, 3), 2);
    }

    @Test
    void times() {
        assertEquals(12, calculator.times(4, 3));
        assertEquals(calculator.times(2, -6), -12);
    }

    @Test
    void karpushinaoSolver() {
        assertArrayEquals(new int[]{2, 0}, calculator.karpushinaoSolver(2, -5, 2));
        assertArrayEquals(new int[]{0}, calculator.karpushinaoSolver(-4, 0, 0));
        assertThrows(ArithmeticException.class, () -> calculator.karpushinaoSolver(0, 0, 0));
    }
  
    @Test
    void romamentevrrSolver() {
        int[] result = calculator.romamentevrrSolver();
        assertEquals(result[0], 3);
        assertEquals(result[1], -2);
    }
}