import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(121, Factorial.calculate(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, Factorial.calculate(10));
    }

    @Test
    void testNegativeNumber() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Factorial.calculate(-1)
        );
    }
}