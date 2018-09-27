
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONObject;

public class JavaCurrencyConversionExample {

    public static void main(String args[]) {

        // converting 1000 Euro to US Dollar
        System.out.println("Euro/US Dollar: " + findExchangeRateAndConvert("EUR", "USD", 1000));

        // converting 1000 US Dollar to Euro
        System.out.println("US Dollar/Euro: " + findExchangeRateAndConvert("USD", "EUR", 1000));

        // converting 1000 US Dollar to Indian Rupee
        System.out.println("US Dollar/Indian Rupee: " + findExchangeRateAndConvert("USD", "INR", 1000));

        // converting 1000 Indian Rupee to US Dollar
        System.out.println("Indian Rupee/US Dollar: " + findExchangeRateAndConvert("INR", "USD", 1000));
    }
   
    private static long findExchangeRateAndConvert(String from, String to, int amount) {
        try {
        	 
            URL url = new URL(" http://free.currencyconverterapi.com/api/v5/convert?q="+from+"_"+to+"&compact=y");
           
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            JSONObject jsonObject = new JSONObject(line); 
            if (line.length() > 0) {
            	JSONObject valueJsonObject = jsonObject.getJSONObject(from+"_"+to);
            	String conversion = valueJsonObject.optString("val");
            	System.out.println(conversion);
                return Math.round(Double.parseDouble(conversion) * amount);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}