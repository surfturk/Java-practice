

import java.awt.*;


import java.util.Arrays;

import java.util.Date;
import java.text.NumberFormat;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        byte age = 34;
        Date now = new Date();

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;

        //string manipulation
        String message = "  Hello World!  " + "Yes!";

        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println(message);

        // arrays
        int[] numbers = {2, 3, 5 ,1, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // constant
        final float Pi = 3.14f;


        // operators
        double result = (double)10 / (double)3;
        System.out.println(result);

        //augmented assignment
        int x = 1;
        x += 2;
        System.out.println(x);

        //order of operations
        int a = 10 + 3 * 2;
        System.out.println(a);

        // math class
        int result2 = Math.round(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);

        // random number with rounded number
        double result4 = Math.round(Math.random() * 100);
        System.out.println(result4);


        // random number with explicit casting
        int result5 = (int)Math.round(Math.random() * 100);
        System.out.println(result5);


         //input and scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age2 = scanner.nextByte();
        System.out.println("You are " + age2);


        // string input
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name:");
        String name = scanner2.nextLine().trim();
        System.out.println("You are " + name);


        // mortgage calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                     * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                     / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);





    }



}