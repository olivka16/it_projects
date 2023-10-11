package gradle_lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAdd() {
        double result = App.add(5.0, 3.0);
        assertEquals(8.0, result, 0.0001); 
    }

    @Test
    public void testSubtract() {
        double result = App.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.0001); 
    }

    @Test
    public void testMultiply() {
        double result = App.multiply(6.0, 5.0);
        assertEquals(30.0, result, 0.0001); 
    }

    @Test
    public void testDivide() {
        double result = App.divide(12.0, 4.0);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        double result = App.divide(10.0, 0.0);
        assertTrue(Double.isNaN(result)); 
    }
}
