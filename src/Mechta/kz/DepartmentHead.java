package Mechta.kz;


public class DepartmentHead {
    private String name;
    private String lastname;

    public DepartmentHead(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    // Отчет по продукции
    public String toString(){
        return "Сегодня, консультант - " + Consultant.getName() + ", продал - " + Consultant.product +
                "\nОтзывов оставили: " + Client.ratsum;
    }
}