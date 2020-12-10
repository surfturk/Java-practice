import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x != y);

        // intro
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // booleans
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        // if statements
        int temp = 86;
        if (temp > 85) {
            System.out.println("It's a hot day!");
            System.out.println("Drink water!");
        }
        else if (temp > 70)
            System.out.println("Beautiful day!");
        else
            System.out.println("Cold day!");

        // simplified if
        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000);

        // ternary operator
        int income2 = 120_000;
        String className = income > 120_000 ? "First" : "Economy";


        // switch statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin!");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }


        // FizzBuzz exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);



    }

}
