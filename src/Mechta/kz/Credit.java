package Mechta.kz;

import java.util.Scanner;

public class Credit {
    private double loanAmount;
    private int numYears;
    private double annualInterestRate;

    public Credit() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сумма кредита: ");
        this.loanAmount = in.nextDouble();

        System.out.println("На сколько лет: ");
        this.numYears = in.nextInt();

        System.out.println("Годовая процентная ставка(%): ");
        this.annualInterestRate = in.nextDouble();

        printAmortizationSchedule(loanAmount, annualInterestRate, numYears);
    }

    public static void printAmortizationSchedule(double principal, double annualInterestRate, int numYears) {
        double interestPaid, principalPaid, newBalance;
        double monthlyInterestRate, monthlyPayment;
        int month;
        int numMonths = numYears * 12;
        monthlyInterestRate = annualInterestRate / 12;
        monthlyPayment = monthlyPayment(principal, monthlyInterestRate, numYears);
        System.out.format("Оплата за месяц: %8.2f%n", monthlyPayment);
        System.out.format("Общая оплата:   %8.2f%n", monthlyPayment * numYears * 12);

        for (month = 1; month <= numMonths; month++) {
            interestPaid = principal * (monthlyInterestRate / 100);
            principalPaid = monthlyPayment - interestPaid;
            newBalance = principal - principalPaid;
            principal = newBalance;
        }
    }

    // Ежемесечная оплата
    static double monthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfYears) {
        monthlyInterestRate /= 100;
        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }
}