import org.junit.*;

public class Calculatortest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testsqrt() {
        double a = 16;
        double expectedResult = 4;
        double result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result,0.0005);;
    }

    @Test
    public void testfactorial() {
        double a = 5;
        double expectedResult = 120;
        double result = calculator.factorial(a);
        Assert.assertEquals(expectedResult, result,0.0005);;
    }

    @Test
    public void testlog() {
        double a = 10;
        double expectedResult = 2.30;
        double result = calculator.log(a);
        Assert.assertEquals(expectedResult, result,0.0005);;
    }

    @Test
    public void testpower() {
        double a = 5;
        double b = 3;
        double expectedResult = 125;
        double result = calculator.power(a, b);
        Assert.assertEquals(expectedResult, result,0.0005);
    }


}
