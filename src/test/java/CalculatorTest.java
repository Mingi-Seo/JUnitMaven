import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Mingi-Seo on 2014-10-23.
 */
public class CalculatorTest
{
    @Test
    public void testCalculator() throws Exception
    {
        Calculator cal = new Calculator();
        int a = 120, b = 4;

        assertThat(a + b, is(cal.sum(a, b)));
        System.out.println("Sum : " + cal.sum(a, b));

        assertThat(a - b, is(cal.sub(a, b)));
        System.out.println("Sub : " + cal.sub(a, b));

        assertThat(a / b, is(cal.div(a, b)));
        System.out.println("Div : " + cal.div(a, b));

        assertThat(a * b, is(cal.mul(a, b)));
        System.out.println("Mul : " + cal.mul(a, b));

        assertThat(a % b, is(cal.mod(a, b)));
        System.out.println("Mod : " + cal.mod(a, b));
    }
}
