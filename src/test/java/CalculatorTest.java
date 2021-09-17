import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void shouldDoAdditionOfTwoNumbers() {
        int sum = new Calculator().returnSumOfTwoNumbers(10, 20);
        Assert.assertEquals(30, sum);
    }

    @Test
    public void shouldDoMultiplicationOfTwoNumbers() {
        int multiplication = new Calculator().returnMultiplicationOfTwoNumbers(10, 10);
        Assert.assertEquals(100, multiplication);
    }

    @Test
    public void shouldDoSubstractionOfTwoNumbers() {
        int subtraction = new Calculator().returnSubtractionOfTwoNumbers(15, 10);
        Assert.assertEquals(5, subtraction);
    }

    @Test
    public void shouldDoDivisionOfTwoNumbers() {
        int division = new Calculator().returnDivisionOfTwoNumbers(10, 2);
        Assert.assertEquals(5, division);
    }
}
