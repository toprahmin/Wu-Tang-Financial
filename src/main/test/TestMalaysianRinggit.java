import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestMalaysianRinggit {
    MalaysianRinggit malaysianRinggit;

    @Before
    public void setup(){
        malaysianRinggit = new MalaysianRinggit();
    }

    @Test
    public void testConvertToMalaysianRinggit(){
        //: Given
        double usDollarAmountToConvert = 43.12;
        double expectedConversion = 192.75;
        //: When
        double actualConversion = malaysianRinggit.convertToMalaysianRinggit(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Malaysian Ringgit is: 192.75",expectedConversion,actualConversion,0.001);

    }
    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 250.00;
        double expectedUSDollarAmount = 55.93;

        double actualConversion = malaysianRinggit.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from Ringgits to US Dollars is: 55.93", expectedUSDollarAmount,actualConversion,0.001);
    }

}
