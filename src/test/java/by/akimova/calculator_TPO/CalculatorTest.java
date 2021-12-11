package by.akimova.calculator_TPO;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testing class for {@link Calculator}
 *
 * @author anastasiyaakimava
 * @version 1.0
 */
public class CalculatorTest {
    public static Calculator calculatorTest;

    @BeforeClass
    public static void testSet() {

        calculatorTest = new Calculator();
    }

    @Test
    public void test_sum_positive() {

        assertEquals(4, calculatorTest.sum(2, 2));
    }

    @Test
    public void test_sum_negative() {

        assertEquals(-1000, calculatorTest.sum(-100, -900));
    }

    @Test
    public void test_sum_big() {

        assertEquals(120000, calculatorTest.sum(30000, 90000));
    }

    @Test
    public void test_sum_0() {

        assertEquals(-999999999, calculatorTest.sum(0, -999999999));
    }

    @Test
    public void test_sum_double() {

        assertEquals(1.78, calculatorTest.sum(1.7, 0.08), 0.001);
    }

    @Test
    public void test_sum_maxIntNegative() {
        assertEquals(-2147483648, calculatorTest.sub(-2147483648, 0));
    }

    @Test
    public void test_sum_maxIntPositive() {
        assertEquals(2147483647, calculatorTest.sub(2147483647, 0));
    }

    @Test
    public void test_mul() {

        assertEquals(150, calculatorTest.mult(3, 50));
    }

    /**
     * Test failed
     */
    @Test
    public void test_mul_double() {
        assertEquals(1.65, calculatorTest.mult(1.25, 1.32), 0.0001);
    }

    @Test
    public void test_div() {
        assertEquals(10, calculatorTest.div(100, 10), 0.001);
    }

    @Test
    public void test_div_double() {
        assertEquals(17.6, calculatorTest.div(88.0, 5.0), 0.0001);
    }

    /**
     * Test failed
     */
    @Test
    public void test_cos() {
        assertEquals(0.862319, calculatorTest.cos(100), 0.0001);
    }

    @Test
    public void test_sin() {
        assertEquals(-0.506366, calculatorTest.sin(100), 0.0001);
    }

    /**
     * Test failed
     */
    @Test
    public void test_tg() {
        assertEquals(0.473815, calculatorTest.tg(35), 0.0001);
    }

    /**
     * Test failed
     */
    @Test
    public void test_ctg() {
        assertEquals(2.1105296161446585, calculatorTest.ctg(35), 0.0001);
    }

}
