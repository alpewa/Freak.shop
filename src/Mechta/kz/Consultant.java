package Mechta.kz;

import java.util.Scanner;

public class Consultant extends WareHouse {
    static String name;
    static String phones;
    static String TV;
    static double salary;
    static String washingMachine;
    static String laptop;
    static String role;

    public static void setSalary(double salary) {
        Consultant.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public static double getSalary() {
        return salary;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        Consultant.role = role;
    }

    public Consultant(double salary, String role, String name) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        System.out.println(toString());
        System.out.println("Что желаете приобрести?");
        System.out.println(
                "----------------Список товара---------------" +
                        "\n1 - TV" +
                        "\n2 - Стиральные машины" +
                        "\n3 - Телефоны" +
                        "\n4 - Ноутбуки" +
                        "\n--------------------------------------------");
    }

    // Выбор товара
    public void chooseProduct() {
        do {
            System.out.print("Выбирите товар ");
            Scanner in = new Scanner(System.in);
            String product = in.nextLine();
            if (product.equals("1")) {
                tvInfo();
                chooseTV();
            } else if (product.equals("2")) {
                WashingMachineInfo();
                chooseWashingMachine();
            } else if (product.equals("3")) {
                phoneInfo();
                choosePhone();
            } else if (product.equals("4")) {
                laptopInfo();
                chooseLaptop();
            } else {
                break;
            }
        } while (1 == 0);
    }

    // Телефоны
    public void choosePhone() {
        do {
            System.out.print("В наличии есть модели: ");
            Scanner in = new Scanner(System.in);
            phones = in.nextLine();
            if (phones.equals("1")) {
                System.out.println(
                        "-------------Iphone---------------" +
                                "\n1 - Iphone XS" +
                                "\n2 - Iphone X" +
                                "\n3 - Iphone 11pro" +
                                "\n4 - Iphone 12pro" +
                                "\n5 - Iphone SE2"
                                + "\n---------------------------------");
                showInfoIPhone();
            } else if (phones.equals("2")) {
                System.out.println(
                        "---------------Huawei----------------" +
                                "\n1 - Huawei P30" +
                                "\n2 - Huawei P40pro" +
                                "\n3 - Huawei Mate30Pro" +
                                "\n-----------------------------------");
                showInfoHuawei();
            } else if (phones.equals("3")) {
                System.out.println(
                        "---------------Samsung----------------" +
                                "\n1 - Samsung A51" +
                                "\n2 - Samsung A10" +
                                "\n3 - Samsung S10"
                                + "\n----------------------------------");
                showInfoSamsung();
            } else if (phones.equals("4")) {
                System.out.println(
                        "----------------Xiaomi---------------" +
                                "\n1 - Xiaomi RedmiNote9" +
                                "\n2 - Xiaomi RedmiNote9Pro" +
                                "\n3 - Xiaomi Redmi9A"
                                + "\n--------------------------------");
                showInfoXiaomi();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public void phoneInfo() {
        System.out.println(
                "--------------------------------" +
                        "\nВыбирите телефон ,который вам нужен: " +
                        "\n1 - Iphone" +
                        "\n2 - Huawei" +
                        "\n3 - Samsung" +
                        "\n4 - Xiaomi" +
                        "\n--------------------------------");
    }

    // TV
    public void chooseTV() {
        do {
            System.out.print("В наличии есть модели:");
            Scanner in = new Scanner(System.in);
            TV = in.nextLine();
            if (TV.equals("1")) {
                System.out.println(
                        "---------------Samsung----------------" +
                                "\n1 - LED_SAMSUNG_UE_50_TU_7100" +
                                "\n2 - LED_SAMSUNG_UE_32_T_4500" +
                                "\n3 - LED_SAMSUNG_UE_65_TU_8000" +
                                "\n--------------------------------------");
                showInfoTVSamsung();
            } else if (TV.equals("3")) {
                System.out.println(
                        "-------------Xiaomi--------------" +
                                "\n1 - LED_XIAOMI_Mi_TV_4S_50" +
                                "\n2 - LED_XIAOMI_Mi_TV_4S_65" +
                                "\n3 - ED_XIAOMI_Mi_TV_4S_43" +
                                "\n--------------------------");
                showInfoTVXiaomi();
            } else if (TV.equals("2")) {
                System.out.println(
                        "----------------LG--------------" +
                                "\n1 - LED_LG_75NANO996NA" +
                                "\n2 - OLED_LG_55CXRLA" +
                                "\n3 - LED_LG_65_UN73506LB" +
                                "\n--------------------------------");
                showInfoTVLG();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public static void tvInfo() {
        System.out.println(
                ("--------------------------------") +
                        "\nВыбирите телевизор ,который вам нужен: " +
                        "\n1 - Samsung" +
                        "\n2 - LG" +
                        "\n3 - Xiaomi" +
                        "\n--------------------------------");
    }

    // Ноутбуки
    public void chooseLaptop() {
        do {
            System.out.print("В наличии есть модели:");
            Scanner in = new Scanner(System.in);
            laptop = in.nextLine();
            if (laptop.equals("1")) {
                System.out.println(
                        "---------------Asus-----------------" +
                                "\n1 - Asus_TUF_Gaming_FX505DT_i7_9750H" +
                                "\n2 - Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H" +
                                "\n3 - Asus_ROG_Strix_G15_i7_10750H" +
                                "\n--------------------------------");
                showInfoLaptopAsus();
            } else if (laptop.equals("2")) {
                System.out.println(
                        "----------------Lenovo----------------" +
                                "\n1 - Lenovo_IdeaPad_3_Ryzen_3_3250U" +
                                "\n2 - Lenovo_IdeaPad_3_i3_1005G1" +
                                "\n3 - Lenovo_IdeaPad_3_Athlon_Silver_3050U" +
                                "\n--------------------------------");
                showInfoLaptopLenovo();
            } else if (laptop.equals("3")) {
                System.out.println(
                        "----------------MacBook----------------" +
                                "\n1 - Apple_MacBook_Air_Retina" +
                                "\n2 - Apple_MacBook_Air_13" +
                                "\n3 - Apple_MacBook_Pro_Touch_Bar_Retina_2020" +
                                "\n--------------------------------");
                showInfoLaptopMacBook();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public static void laptopInfo() {
        System.out.println(
                "--------------------------------" +
                        "\nВыбирите нотбук ,который вам нужен: " +
                        "\n1 - Asus" +
                        "\n2 - Lenovo" +
                        "\n3 - MacBook" +
                        "\n--------------------------------");
    }

    // Стиральные машины
    public void chooseWashingMachine() {
        do {
            System.out.print("В наличии есть модели:");
            Scanner in = new Scanner(System.in);
            washingMachine = in.nextLine();
            if (washingMachine.equals("1")) {
                System.out.println(
                        "----------------LG----------------" +
                                "\n1 - LG_F_1296HDS4" +
                                "\n2 - LG_F4_V5RS0W" +
                                "\n3 - LG_F_12B8WDS7" +
                                "\n--------------------------------");
                showInfoWMLG();
            } else if (washingMachine.equals("2")) {
                System.out.println(
                        "----------------Samsung----------------" +
                                "\n1 - SAMSUNG_WF_8590NLW9DY" +
                                "\n2 - SAMSUNG_WW_60K40G09WDLD" +
                                "\n3 - SAMSUNG_WF_60F1R2E2WD" +
                                "\n--------------------------------");
                showInfoWMsamsung();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public void WashingMachineInfo() {
        System.out.println(
                "--------------------------------" +
                        "\nВыбирите стиральную машину ,которая вам нужна: " +
                        "\n1 - LG" +
                        "\n2 - Samsung" +
                        "\n--------------------------------");
    }

    public String toString() {
        return "Имя консултанта: " + getName() +
                "\nДолжность консультанта: " + getRole();
    }
}