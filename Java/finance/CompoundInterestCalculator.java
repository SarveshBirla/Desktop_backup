package finance;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();

        System.out.print("Enter the number of times that interest is compounded per unit time: ");
        int n = input.nextInt();

        double amount = principal * Math.pow(1 + (rate / n), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest after " + time + " years: " + compoundInterest);
        System.out.println("Total amount after " + time + " years: " + amount);

        input.close();
    }
}