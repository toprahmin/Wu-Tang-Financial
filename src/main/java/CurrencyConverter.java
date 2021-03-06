
/**
 * Created by rahmirford on 5/22/17.
 */
public class CurrencyConverter {
    public double usDollarConvertedValue = 0;
    public double convertedForeignValue = 0;


    // Switch statement takes a string and double returns double(usDollar)
    // another switch statement is called which takes a string(exchange currency and a double(usDollar)

    public double foreignCurrencyToUsDollar(String currentCurrency, double loot){

        switch(currentCurrency){

            case "dollar":
                usDollarConvertedValue = USDollar.convertToUSDollar(loot);
                break;
            case "euro":
                usDollarConvertedValue = Euro.convertToUSDollar(loot);
            break;
            case "pound":
                usDollarConvertedValue = BritishPound.convertToUSDollar(loot);
            break;
            case "rupee":
                usDollarConvertedValue = Rupee.convertToUSDollar(loot);
            break;
            case "australianDollar":
                usDollarConvertedValue = AustralianDollar.convertToUSDollar(loot);
                break;
            case "canadianDollar":
                usDollarConvertedValue = CanadianDollar.convertToUSDollar(loot);
                break;
            case "singaporeDollar":
                usDollarConvertedValue = SingaporeDollar.convertToUSDollar(loot);
                break;
            case "franc":
                usDollarConvertedValue = SwissFranc.convertToUSDollar(loot);
                break;
            case "ringgit":
                usDollarConvertedValue = MalaysianRinggit.convertToUSDollar(loot);
                break;
            case "yen":
                usDollarConvertedValue = JapaneseYen.convertToUSDollar(loot);
                break;
            case "renminbi":
                usDollarConvertedValue = ChineseYuanRenminbi.convertToUSDollar(loot);
                break;
            default:
                System.out.println("Invalid entry");
                break;
            }
        return usDollarConvertedValue;
    }


    public  double usDollarToForeignCurrency(String exchangeCurrency, double dollar){

        switch (exchangeCurrency) {
            case "dollar":
                convertedForeignValue = USDollar.convertToUSDollar(dollar);
                break;
            case "euro":
                convertedForeignValue = Euro.convertToEuro(dollar);
                break;
            case "pound":
                convertedForeignValue = BritishPound.convertToBritishPound(dollar);
                break;
            case "rupee":
                convertedForeignValue = Rupee.convertToIndianRupee(dollar);
                break;
            case "australianDollar":
                convertedForeignValue = AustralianDollar.convertToAustralianDollar(dollar);
                break;
            case "canadianDollar":
                convertedForeignValue = CanadianDollar.convertToCanadianDollar(dollar);
                break;
            case "singaporeDollar":
                convertedForeignValue = SingaporeDollar.convertToSingaporeDollar(dollar);
                break;
            case "franc":
                convertedForeignValue = SwissFranc.convertToSwissFranc(dollar);
                break;
            case "ringgit":
                convertedForeignValue = MalaysianRinggit.convertToMalaysianRinggit(dollar);
                break;
            case "yen":
                convertedForeignValue = JapaneseYen.convertToJapaneseYen(dollar);
                break;
            case "renminbi":
                convertedForeignValue = ChineseYuanRenminbi.convertToChineseYuanRenminbi(dollar);
                break;
        }
            return convertedForeignValue;

    }




    public double converter(String currentCurrency, double loot, String exchangeCurrency){
        foreignCurrencyToUsDollar(currentCurrency,loot);
        convertedForeignValue = usDollarToForeignCurrency(exchangeCurrency,usDollarConvertedValue);




        System.out.printf("You have %.2f worth of diversified bonds.", convertedForeignValue);
        return convertedForeignValue;
    }








}
