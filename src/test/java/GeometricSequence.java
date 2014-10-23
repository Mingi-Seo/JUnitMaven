/**
 * Created by Mom on 2014-10-23.
 */
public class GeometricSequence
{
    public double geoSeq(int n)
    {
        if (n == 1)
            return 3.0;

        return 1.3 * geoSeq(n - 1);
    }
}
