

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


        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000);

    }

}
