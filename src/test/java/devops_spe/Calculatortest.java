import org.junit.*;

public class Calculatortest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testsqrt() {
        int a = 16;
        int expectedResult = 4;
        long result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testfactorial() {
        int a = 5;
        int expectedResult = 120;
        long result = calculator.factorial(a);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testlog() {
        int a = 10;
        long expectedResult = 1;
        long result = calculator.log(a);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testpower() {
        int a = 5;
        int b = 3;
        double expectedResult = 125;
        double result = calculator.power(a, b);
        Assert.assertEquals(expectedResult, result);
    }


}
