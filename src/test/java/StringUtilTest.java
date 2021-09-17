import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {
    @Test
    public void shouldGetLengthOfAString() {

        String testString = returnString("Hello World");
        Assert.assertEquals(testString.length(), 11);
    }

    private String returnString(String testString) {
        return testString;
    }

}
