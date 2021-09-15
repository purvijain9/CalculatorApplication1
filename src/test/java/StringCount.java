import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCount {
    @Test
    public void shouldGetLengthOfAString(){

        String testString="Hello World";
        Assert.assertEquals(testString.length(),11);


    }
}
