package calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumWithOne() {
        int res = calculator.sum(1);
        assertEquals(1, res);
    }

    @Test
    void testSumWithPositiveNumber() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumWithZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
        assertEquals("N must be greater than zero", exception.getMessage());
    }
}