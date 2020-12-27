package Mechta.kz;

import java.util.Scanner;

public class BankManager {
    static double annualInterestRate;
    static double monthlyInterestRate;
    static int numOfYears;
    static double loanAmount;
    static double monthlyPayment;
    static double totalPayment;

    // Кредит
    public static void credit() {
        if (Client.age >= 21) {
            System.out.println("Мы одобряем кредит, введите свои данные");
            System.out.println("Личные данные: " +
                    "\nИмя - " + Client.clientName +
                    "\nФамилия - " + Client.clientLastName +
                    "\nВозраст - " + Client.age);
            Scanner in = new Scanner(System.in);

            System.out.println("На какую сумму хотите взять кредит? " + ", предлагаемая сумма:" + (Client.bank - WareHouse.cost));
            loanAmount = in.nextDouble();

            System.out.println("Введите годовую процентную ставку: ");
            annualInterestRate = in.nextDouble();

            monthlyInterestRate = annualInterestRate / 12;

            System.out.println("На сколько лет хотите оформить кредит? : ");
            numOfYears = in.nextInt();

            monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));

            totalPayment = monthlyPayment * numOfYears * 12;

            System.out.println("Ежемесячная оплата " + (int) (monthlyPayment * 100 / 100.0) + " kz");
            System.out.println("Пройдите на кассу , чтобы забрать товар");
        } else if (Client.age < 21) {
            System.out.println("Мы отклоняем кредит");
            System.out.println("Извините, вы не достигли 21 года");
            System.out.println("Приходите в следующий раз");
        }
    }
}