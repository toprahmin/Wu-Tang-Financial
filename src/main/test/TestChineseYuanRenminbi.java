import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/23/17.
 */
public class TestChineseYuanRenminbi {

    ChineseYuanRenminbi chineseYuanRenminbi;

    @Before
    public void setup(){
        chineseYuanRenminbi = new ChineseYuanRenminbi();
    }

    @Test
    public void testConvertToChineseYuanRenminbi(){
        //: Given
        double usDollarAmountToConvert = 68.47;
        double expectedConversion = 473.81;
        //: When
        double actualConversion = chineseYuanRenminbi.convertToChineseYuanRenminbi(usDollarAmountToConvert);
        //: Then
        Assert.assertEquals("The expected conversion from US Dollar to Chinese Yuan Renminbi is: 473.81",expectedConversion,actualConversion,0.001);
    }

    @Test
    public void testConvertToUSDollar(){
        double amountToConvert = 470.43;
        double expectedUSDollarAmount = 67.98;

        double actualConversion = chineseYuanRenminbi.convertToUSDollar(amountToConvert);

        Assert.assertEquals("The expected conversion from Renminbi to US Dollars is: 67.98", expectedUSDollarAmount,actualConversion,0.001);
    }
}
