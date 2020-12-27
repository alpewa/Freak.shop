package Mechta.kz;

import java.util.Scanner;

public class Cashier{
    private String name = "Сергей Десаут";
    private String payment;
    private String password;
    private int defaultPasswordLength = 5;

    public void ordering(){
        System.out.println("Здравствуйте, меня зовут " + name + ", покажите свой товар");
    }

    // Выбрать способ оплаты
    public void paymentMethod() {
        System.out.println("Выбирите способ оплаты: " + "\n- карта" + "\n- наличка");
        Scanner scan = new Scanner(System.in);
        this.payment = scan.nextLine();
        if (payment.equals("карта")) {
            System.out.println("Приложите карту");
            System.out.println("Введите ваш пин-код:");
            this.password = Client.randomPassword(defaultPasswordLength);
            System.out.println("Пин-код: " + this.password);
            if (Client.bank < WareHouse.cost){
                showCheckLoan();
            } else if (Client.bank == WareHouse.cost) {
                System.out.println("К оплате: " + Consultant.cost);
                System.out.println("Спасибо за покупку");
                showCheck();
            } else if (Client.bank >= WareHouse.cost) {
                System.out.println("Ваш банк: " + Client.bank);
                System.out.println("Сдача: " + (Client.bank - WareHouse.cost));
                System.out.println("Спасибо за покупку");
                showCheck();
            }
        } else if (payment.equals("наличка")) {
            if (Client.bank < WareHouse.cost){
                System.out.println("У вас не хватает деняк, приходите , когда накопите");
            } else if (Client.bank == WareHouse.cost){
                System.out.println("К оплате: " + Consultant.cost);
                System.out.println("Спасибо за покупку");
                showCheck();
            } else if (Client.bank >= WareHouse.cost) {
                System.out.println("Ваш банк: " + Client.bank);
                System.out.println("Сдача: " + (Client.bank - WareHouse.cost));
                System.out.println("Спасибо за покупку");
                showCheck();
            }
        }
    }

    // Чек в случае , если клиент не взял кредит
    public void showCheck(){
            System.out.println("---------------ЧЕК---------------");
            System.out.println("Товар: " + Consultant.product);
            System.out.println("Цена: " + Consultant.cost);
            System.out.println("Сдача: " + (Client.bank - WareHouse.cost));
            System.out.println("Принял товар: " + name);
            System.out.println("---------------------------------");
    }

    // Чек в случае, если клиент взял кредит
    public void showCheckLoan(){
            System.out.println("---------------ЧЕК---------------");
            System.out.println("Товар: " + Consultant.product);
            System.out.println("Цена: " + Consultant.cost);
            takeProduct();
            System.out.println("Принял товар: " + name);
            System.out.println("---------------------------------");
    }

    public static void takeProduct(){
        System.out.println("Информация об оплате:");
        Client.showLoanProof();
    }
}