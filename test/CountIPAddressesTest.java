import static org.junit.Assert.assertEquals;

import codewars.CountIPAddresses;
import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.junit.Test;

public class CountIPAddressesTest {

    @Test
    public void normalTest() throws Exception {
        assertEquals( 50, CountIPAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ) );
        assertEquals( 246, CountIPAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ) );
    }

    @Test(expected = NumberFormatException.class)
    public void paramIsNumber() throws Exception {
        CountIPAddresses.ipsBetween( "a", "b" );
    }

    @Test(expected = IllegalArgumentException.class)
    public void endIsBigger() throws Exception {
        CountIPAddresses.ipsBetween( "0.0.0.1", "0.0.0.0" );
    }
}