package Mechta.kz;

import java.util.Scanner;

public class Client {
    static String clientName;
    static String clientLastName;
    static int bank;
    static int age;
    private int defaultPasswordLength = 5;
    static String takeLoan;
    static int positiveRat;
    static int negativeRat;
    static int ratsum = 0;
    static int client;
    static int cons;

    public String getClientName() {
        return clientName;
    }

    public int getBank() {
        return bank;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        Scanner in = new Scanner(System.in);
        System.out.println("Мое имя: ");
        this.clientName = in.nextLine();

        System.out.println("Моя фамилия: ");
        this.clientLastName = in.nextLine();

        System.out.println("Мой возраст: ");
        this.age = in.nextInt();

        System.out.println("Мой бюджет: ");
        this.bank = in.nextInt();
    }

    // Генерация пароля
    public static String randomPassword(int length) {
        String passwordSet = "0123456789";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Отмена платежа
    public void declinePayment() {
        Scanner scan = new Scanner(System.in);
        if (getBank() < WareHouse.cost) {
            System.out.println("Ваш банк не позволяет купить данный товар, ваш бюджет: " + getBank());
            System.out.println("Предлагаю взять кредит");
            System.out.println("взять/не взять");
            String takeLoan = scan.nextLine();
            if (takeLoan.equals("взять")) {
                BankManager.credit();
            } else if (takeLoan.equals("не взять")) {
                System.out.println("Извините, приходите в другой раз");
            }
        }
    }

    public static void showLoanProof() {
        if (Client.age >= 21) {
            System.out.println("--------------------");
            System.out.println("Кредит был одобрен");
            System.out.println("Процентная ставка: " + BankManager.annualInterestRate);
            System.out.println("Ежемесячная оплата " + (int) (BankManager.monthlyPayment * 100 / 100.0) + " kz");
            System.out.println(Consultant.product);
            System.out.println("Печать об одобрении кредита");
            System.out.println("--------------------");
        } else if (Client.age < 21) {
            System.out.println("--------------------");
            System.out.println("Кредит не был одобрен");
            System.out.println("Печать об отказе в кредите");
            System.out.println("--------------------");
        }
    }

    public void rating() {
        System.out.println("Желаете оставить отзыв о консультанте?");
        Scanner in = new Scanner(System.in);
        String rait = in.nextLine();
        if (rait.equals("да")) {
            System.out.println("1 - Отлично" + "\n2 - Средне" + "\n3 - Плохо");
            int choose = in.nextInt();
            if (choose == 1) {
                positive();
            } else if (choose == 2) {
                positive();
            } else if (choose == 3) {
                negative();
            }
            Admin.salary_for_each_consultant();
        } else if (rait.equals("нет")) {
            System.out.println("Спасибо , что приобрели товар в нашем магазине");
        }
    }

    public static void positive() {
        ratsum++;
        positiveRat = ratsum;
    }

    public static void negative() {
        ratsum--;
        negativeRat = ratsum;
    }

    // Основная часть
    public void test() {
        // Кол-во клиентов == кол-ву консультантов
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько клиентов пришло в магазин");
        int newClient = in.nextInt();
        client = newClient;
        Consultant[] consultants = new Consultant[newClient];
        for (int n = 0; n < newClient; n++) {
            System.out.println("Выбирите консультанта");
            System.out.println("1 - Старший Консультант -- Алексей Пчелкин" +
                    "\n2 - Младший Консультант -- Ваня Строго" +
                    "\n3 - Старший Консультант -- Дмитрий Ликс" +
                    "\n4 - Младший Консультант -- Вадим Каравай");
            int chooseCons = in.nextInt();
            cons = chooseCons;
            if (chooseCons == 1) {
                consultants[n] = new Consultant(400, "Старший Консультант", "Алексей Пчелкин");
                consultants[n].chooseProduct();
                System.out.println("Клиент сделал свой выбор и представляется");
                Client cl1 = new Client();
                cl1.introduce();
                cl1.declinePayment();
                cl1.rating();
                System.out.println("Клиент подходит к касиру");
                Cashier cs1 = new Cashier();
                cs1.ordering();
                cs1.paymentMethod();
            } else if (chooseCons == 2) {
                consultants[n] = new Consultant(220, "Младший Консультант", "Ваня Строго");
                consultants[n].chooseProduct();
                System.out.println("Клиент сделал свой выбор и представляется");
                Client cl2 = new Client();
                cl2.introduce();
                cl2.declinePayment();
                cl2.rating();
                System.out.println("Клиент подходит к касиру");
                Cashier cs2 = new Cashier();
                cs2.ordering();
                cs2.paymentMethod();
            } else if (chooseCons == 3) {
                consultants[n] = new Consultant(400, "Старший Консультант", "Дмитрий Ликс");
                consultants[n].chooseProduct();
                System.out.println("Клиент сделал свой выбор и представляется");
                Client cl3 = new Client();
                cl3.introduce();
                cl3.declinePayment();
                cl3.rating();
                System.out.println("Клиент подходит к касиру");
                Cashier cs3 = new Cashier();
                cs3.ordering();
                cs3.paymentMethod();
            } else if (chooseCons == 4) {
                consultants[n] = new Consultant(220, "Младший Консультант", "Вадим Каравай");
                consultants[n].chooseProduct();
                System.out.println("Клиент сделал свой выбор и представляется");
                Client cl4 = new Client();
                cl4.introduce();
                cl4.declinePayment();
                cl4.rating();
                System.out.println("Клиент подходит к касиру");
                Cashier cs4 = new Cashier();
                cs4.ordering();
                cs4.paymentMethod();
            }
        }
    }
}