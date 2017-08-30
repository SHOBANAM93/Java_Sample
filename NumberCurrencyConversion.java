import java.util.*;
import java.text.*;

public class NumberCurrencyConversion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale locale = new Locale("zh","CN");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String china = currencyFormat.format(payment);
        
        locale = new Locale("fr","FR");
        currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String france = currencyFormat.format(payment);
        
        locale = new Locale("en","US");
        currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String us = currencyFormat.format(payment);
        
        locale = new Locale("en","IN");
        currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String india = currencyFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
