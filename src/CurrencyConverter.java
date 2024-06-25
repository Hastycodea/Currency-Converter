import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> currencyCodes = new HashMap<>();

        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "KSHS");
        currencyCodes.put(3, "EUR");
        currencyCodes.put(4, "INR");
        currencyCodes.put(5, "NAIRA");

        String fromCode, toCode;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        System.out.println("Currency converting FROM: ");
        System.out.println("1:USD \t 2:KSH \t 3:EUR \t 4:INR \t 5:NAIRA");

        fromCode = currencyCodes.get(scanner.nextInt());

        System.out.println("Currency converting TO: ");
        System.out.println("1:USD \t 2:KSH \t 3:EUR \t 4:INR \t 5:NAIRA");
        toCode = currencyCodes.get(scanner.nextInt());

        amount = scanner.nextFloat();

        // sendHttpGetRequest(fromCode, toCode, amount);


    }
}
