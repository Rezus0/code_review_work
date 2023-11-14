import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void initAll() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void dif() {
        Assertions.assertEquals(10, calculator.dif(15, 5));
    }

    @Test
    void div() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
    }

    @Test
    void times() {
        Assertions.assertEquals(12, calculator.times(4, 3));
    }

    @Test
    void solver() {
        Assertions.assertArrayEquals(new int[]{2, 0}, calculator.solver(2, -5, 2));
        Assertions.assertArrayEquals(new int[]{0}, calculator.solver(-4, 0, 0));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.solver(0, 0, 0));
    }
}