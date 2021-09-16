import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCount {
    @Test
    public void shouldGetLengthOfAString(){

        String testString = returnString("Hello World");
        Assert.assertEquals(testString.length(),11);
    }

    private String returnString(String testString) {
        return testString;
    }

    @Test
    public void additionOfTwoNumbers(){
        int sum = new Calculator().returnSumOfTwoNumbers(10,20);
        Assert.assertEquals(30,sum);
    }

    @Test
    public void multiplicationOfTwoNumbers(){
        int multiplication = new Calculator().returnMultiplicationOfTwoNumbers(10,10);
        Assert.assertEquals(100,multiplication);
    }

    @Test
    public void substractionOfTwoNumbers(){
        int sub = new Calculator().returnSubtractionOfTwoNumbers(15,10);
        Assert.assertEquals(5,sub);
    }

    @Test
    public void divisionOfTwoNumbers(){
        int div = new Calculator().returnDivisionOfTwoNumbers(10,2);
        Assert.assertEquals(5,div);
    }


}
