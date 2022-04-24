package consumer;

import org.example.currency.Address;
import org.example.currency.Currency;

import java.util.Locale;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceLoader<Currency> serviceLoader = ServiceLoader.load(Currency.class);
        System.out.println("Du har följande val");

        for (Currency currency : serviceLoader) {
            var annotation = currency.getClass().getAnnotation(Address.class);
            if (annotation == null) {
                System.out.println("Ingen valuta presenteras");
            } else {
                System.out.println(annotation.value());
            }
        }
        String chooseCurrency = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Ange värde i sek att omvandla");
        int valuesek = scanner.nextInt();
        System.out.println("omvandlad i vald valuta");
        for (Currency currency : serviceLoader) {
            var annotation = currency.getClass().getAnnotation(Address.class);
            if (annotation.value().equals(chooseCurrency)) {
                System.out.println(valuesek / currency.currency() + " " + annotation.value());

            }
        }
    }
}