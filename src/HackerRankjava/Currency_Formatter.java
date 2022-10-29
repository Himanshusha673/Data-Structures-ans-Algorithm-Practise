package HackerRankjava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        //creating a instance of locale for india because ind does not have build in locale

        Locale IND = new Locale("en","in");
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(IND);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);



        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        ////////////////////////
        india.replace("₹", "Rs.");

        String france = frFormat.format(payment);
        String china = cnFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
