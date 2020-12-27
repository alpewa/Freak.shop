package Mechta.kz;


public class Admin {
    private String name;
    private String lastName;

    // Выдача зарплаты
    public static void salary_for_each_consultant() {
        if (Consultant.getRole().equals("Старший Консультант")) {
            System.out.println("*------Вас обслужил------*");
            System.out.println("Имя консультанта: " + Consultant.getName());
            System.out.println("Его рейтинг: " + Client.ratsum);
            System.out.println("Его зарплата: " + Consultant.getSalary());
            if (Client.ratsum >= 1) {
                System.out.println("   Спасибо за вашу оценку, она помогла нашему консультанту!");
                System.out.println("   " + Consultant.getName());
                System.out.println("   Поздравляю с повышением зарплаты");
                Consultant.salary += 100;
                System.out.println(Consultant.getSalary());
            } else if (Client.ratsum < 1) {
                System.out.println("К сожалению придется вас понизить до Младшего консультанта");
                Consultant.setRole("Младший Консультант");
            }
            raising();
        } else if (Consultant.getRole().equals("Младший Консультант")) {
            System.out.println("*------------*");
            System.out.println("Имя консультанта: " + Consultant.getName());
            System.out.println("Его рейтинг: " + Client.ratsum);
            System.out.println("Его зарплата: " + Consultant.getSalary());
            if (Client.ratsum >= 1) {
                System.out.println("   Спасибо за вашу оценку, она помогла нашему консультанту!");
                System.out.println("   " + Consultant.getName());
                System.out.println("   Поздравляю с повышением зарплаты");
                Consultant.salary += 180;
            } else if (Client.ratsum < 1) {
                System.out.println("К сожалению придется вас уволить из-за плохих отзывов");
                Consultant.setRole("Уволен");
            }
            raising();
        }
    }

    // Повышение - уволнение
    public static void raising() {
        if (Client.positiveRat >= 2) {
            Client.positive();
        } else if (Client.negativeRat >= 2) {
            Client.negative();
        }
    }
}