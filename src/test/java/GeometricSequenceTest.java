import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Mingi-Seo on 2014-10-23.
 */
public class GeometricSequenceTest
{
    @Test
    public void testGeoSeq() throws Exception
    {
        GeometricSequence geoSeq = new GeometricSequence();
        int n = 5;
        double result = 0.0;

        result = geoSeq.geoSeq(n);
        System.out.println("Result : " + result);

        assertThat(result, is(geoSeq.geoSeq(n)));
    }
}
