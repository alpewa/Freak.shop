package Mechta.kz;

import java.util.Scanner;

public class WareHouse {

    static int cost;
    static String product;
    static int amount;

    public static int getCost() {
        return cost;
    }

    // Информация по телефонам
    // Iphones
    public static void iphoneXSInfo() {
        amount = 2;
        product = "Телефон Iphone XS";
        System.out.println("Аутентификация: " + Iphone.IphoneXS.getAuthenticator());
        System.out.println("Батаррея: " + Iphone.IphoneXS.getBattery());
        System.out.println("Процессор: " + Iphone.IphoneXS.getCPU());
        System.out.println("Внутренняя память: " + Iphone.IphoneXS.getRAM());
        System.out.println("Память: " + Iphone.IphoneXS.getStorage());
        System.out.println("Экран: " + Iphone.IphoneXS.getDisplay());
        System.out.println("Цена: " + Iphone.IphoneXS.getCost());
    }

    public static void iphoneXInfo() {
        amount = 2;
        product = "Телефон Iphone X";
        System.out.println("Аутентификация: " + Iphone.IphoneX.getAuthenticator());
        System.out.println("Батаррея: " + Iphone.IphoneX.getBattery());
        System.out.println("Процессор: " + Iphone.IphoneX.getCPU());
        System.out.println("Внутренняя память: " + Iphone.IphoneX.getRAM());
        System.out.println("Память: " + Iphone.IphoneX.getStorage());
        System.out.println("Экран: " + Iphone.IphoneX.getDisplay());
        System.out.println("Цена: " + Iphone.IphoneX.getCost());
    }

    public static void iphone11proInfo() {
        amount = 2;
        product = "Телефон Iphone 11pro";
        System.out.println("Аутентификация: " + Iphone.Iphone11pro.getAuthenticator());
        System.out.println("Батаррея: " + Iphone.Iphone11pro.getBattery());
        System.out.println("Процессор: " + Iphone.Iphone11pro.getCPU());
        System.out.println("Внутренняя память: " + Iphone.Iphone11pro.getRAM());
        System.out.println("Память: " + Iphone.Iphone11pro.getStorage());
        System.out.println("Экран: " + Iphone.Iphone11pro.getDisplay());
        System.out.println("Цена: " + Iphone.Iphone11pro.getCost());
    }

    public static void iphone12proInfo() {
        amount = 2;
        product = "Телефон Iphone 12pro";
        System.out.println("Аутентификация: " + Iphone.Iphone12pro.getAuthenticator());
        System.out.println("Батаррея: " + Iphone.Iphone12pro.getBattery());
        System.out.println("Процессор: " + Iphone.Iphone12pro.getCPU());
        System.out.println("Внутренняя память: " + Iphone.Iphone12pro.getRAM());
        System.out.println("Память: " + Iphone.Iphone12pro.getStorage());
        System.out.println("Экран: " + Iphone.Iphone12pro.getDisplay());
        System.out.println("Цена: " + Iphone.Iphone12pro.getCost());
    }

    public static void iphoneSE2Info() {
        amount = 2;
        product = "Телефон Iphone SE2";
        System.out.println("Аутентификация: " + Iphone.IphoneSE2.getAuthenticator());
        System.out.println("Батаррея: " + Iphone.IphoneSE2.getBattery());
        System.out.println("Процессор: " + Iphone.IphoneSE2.getCPU());
        System.out.println("Внутренняя память: " + Iphone.IphoneSE2.getRAM());
        System.out.println("Память: " + Iphone.IphoneSE2.getStorage());
        System.out.println("Экран: " + Iphone.IphoneSE2.getDisplay());
        System.out.println("Цена: " + Iphone.IphoneSE2.getCost());
    }

    // Huawei
    public static void huaweiP30() {
        amount = 2;
        product = "Телефон Huawei P30";
        System.out.println("Аутентификация: " + Huawei.P30.getAuthenticator());
        System.out.println("Батаррея: " + Huawei.P30.getBattery());
        System.out.println("Процессор: " + Huawei.P30.getCPU());
        System.out.println("Внутренняя память: " + Huawei.P30.getRAM());
        System.out.println("Память: " + Huawei.P30.getStorage());
        System.out.println("Экран: " + Huawei.P30.getDisplay());
        System.out.println("Цена: " + Huawei.P30.getCost());
    }

    public static void huaweiP40pro() {
        amount = 2;
        product = "Телефон Huawei P40pro";
        System.out.println("Аутентификация: " + Huawei.P40pro.getAuthenticator());
        System.out.println("Батаррея: " + Huawei.P40pro.getBattery());
        System.out.println("Процессор: " + Huawei.P40pro.getCPU());
        System.out.println("Внутренняя память: " + Huawei.P40pro.getRAM());
        System.out.println("Память: " + Huawei.P40pro.getStorage());
        System.out.println("Экран: " + Huawei.P40pro.getDisplay());
        System.out.println("Цена: " + Huawei.P40pro.getCost());
    }

    public static void huaweiMate30pro() {
        amount = 2;
        product = "Телефон Huawei Mate30pro";
        System.out.println("Аутентификация: " + Huawei.Mate30Pro.getAuthenticator());
        System.out.println("Батаррея: " + Huawei.Mate30Pro.getBattery());
        System.out.println("Процессор: " + Huawei.Mate30Pro.getCPU());
        System.out.println("Внутренняя память: " + Huawei.Mate30Pro.getRAM());
        System.out.println("Память: " + Huawei.Mate30Pro.getStorage());
        System.out.println("Экран: " + Huawei.Mate30Pro.getDisplay());
        System.out.println("Цена: " + Huawei.Mate30Pro.getCost());
    }

    // Samsung
    public static void samsungA51() {
        amount = 2;
        product = "Телефон Samsung A51";
        System.out.println("Аутентификация: " + Samsung.A51.getAuthenticator());
        System.out.println("Батаррея: " + Samsung.A51.getBattery());
        System.out.println("Процессор: " + Samsung.A51.getCPU());
        System.out.println("Внутренняя память: " + Samsung.A51.getRAM());
        System.out.println("Память: " + Samsung.A51.getStorage());
        System.out.println("Экран: " + Samsung.A51.getDisplay());
        System.out.println("Цена: " + Samsung.A51.getCost());
    }

    public static void samsungA10() {
        amount = 2;
        product = "Телефон Samsung A10";
        System.out.println("Аутентификация: " + Samsung.A10.getAuthenticator());
        System.out.println("Батаррея: " + Samsung.A10.getBattery());
        System.out.println("Процессор: " + Samsung.A10.getCPU());
        System.out.println("Внутренняя память: " + Samsung.A10.getRAM());
        System.out.println("Память: " + Samsung.A10.getStorage());
        System.out.println("Экран: " + Samsung.A10.getDisplay());
        System.out.println("Цена: " + Samsung.A10.getCost());
    }

    public static void samsungS10() {
        amount = 2;
        product = "Телефон Samsung S10";
        System.out.println("Аутентификация: " + Samsung.S10.getAuthenticator());
        System.out.println("Батаррея: " + Samsung.S10.getBattery());
        System.out.println("Процессор: " + Samsung.S10.getCPU());
        System.out.println("Внутренняя память: " + Samsung.S10.getRAM());
        System.out.println("Память: " + Samsung.S10.getStorage());
        System.out.println("Экран: " + Samsung.S10.getDisplay());
        System.out.println("Цена: " + Samsung.S10.getCost());
    }

    // Xiaomi
    public static void redmiNote9() {
        amount = 2;
        product = "Телефон Xiaomi RedmiNote9";
        System.out.println("Аутентификация: " + Xiaomi.RedmiNote9.getAuthenticator());
        System.out.println("Батаррея: " + Xiaomi.RedmiNote9.getBattery());
        System.out.println("Процессор: " + Xiaomi.RedmiNote9.getCPU());
        System.out.println("Внутренняя память: " + Xiaomi.RedmiNote9.getRAM());
        System.out.println("Память: " + Xiaomi.RedmiNote9.getStorage());
        System.out.println("Экран: " + Xiaomi.RedmiNote9.getDisplay());
        System.out.println("Цена: " + Xiaomi.RedmiNote9.getCost());
    }

    public static void redmiNote9pro() {
        amount = 2;
        product = "Телефон Xiaomi RedmiNote9pro";
        System.out.println("Аутентификация: " + Xiaomi.RedmiNote9Pro.getAuthenticator());
        System.out.println("Батаррея: " + Xiaomi.RedmiNote9Pro.getBattery());
        System.out.println("Процессор: " + Xiaomi.RedmiNote9Pro.getCPU());
        System.out.println("Внутренняя память: " + Xiaomi.RedmiNote9Pro.getRAM());
        System.out.println("Память: " + Xiaomi.RedmiNote9Pro.getStorage());
        System.out.println("Экран: " + Xiaomi.RedmiNote9Pro.getDisplay());
        System.out.println("Цена: " + Xiaomi.RedmiNote9Pro.getCost());
    }

    public static void redmi9A() {
        amount = 2;
        product = "Телефон Xiaomi Redmi9A";
        System.out.println("Аутентификация: " + Xiaomi.Redmi9A.getAuthenticator());
        System.out.println("Батаррея: " + Xiaomi.Redmi9A.getBattery());
        System.out.println("Процессор: " + Xiaomi.Redmi9A.getCPU());
        System.out.println("Внутренняя память: " + Xiaomi.Redmi9A.getRAM());
        System.out.println("Память: " + Xiaomi.Redmi9A.getStorage());
        System.out.println("Экран: " + Xiaomi.Redmi9A.getDisplay());
        System.out.println("Цена: " + Xiaomi.Redmi9A.getCost());
    }

    public static void showInfoIPhone() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = Iphone.IphoneXS.getCost();
                iphoneXSInfo();
            } else if (model.equals("2")) {
                cost = Iphone.IphoneX.getCost();
                iphoneXInfo();
            } else if (model.equals("3")) {
                cost = Iphone.Iphone11pro.getCost();
                iphone11proInfo();
            } else if (model.equals("4")) {
                cost = Iphone.Iphone12pro.getCost();
                iphone12proInfo();
            } else if (model.equals("5")) {
                cost = Iphone.IphoneSE2.getCost();
                iphoneSE2Info();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public static void showInfoXiaomi() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = Xiaomi.RedmiNote9.getCost();
                redmiNote9();
            } else if (model.equals("2")) {
                cost = Xiaomi.RedmiNote9Pro.getCost();
                redmiNote9pro();
            } else if (model.equals("3")) {
                cost = Xiaomi.Redmi9A.getCost();
                redmi9A();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public void showInfoHuawei() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = Huawei.P30.getCost();
                huaweiP30();
            } else if (model.equals("2")) {
                cost = Huawei.P40pro.getCost();
                huaweiP40pro();
            } else if (model.equals("3")) {
                cost = Huawei.Mate30Pro.getCost();
                huaweiMate30pro();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public void showInfoSamsung() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = Samsung.A51.getCost();
                samsungA51();
            } else if (model.equals("2")) {
                cost = Samsung.A10.getCost();
                samsungA10();
            } else if (model.equals("3")) {
                cost = Samsung.S10.getCost();
                samsungS10();
            } else {
                break;
            }
        } while (1 == 0);
    }

    // TV's
    // Samsung
    public static void LED_SAMSUNG_UE_50_TU_7100() {
        amount = 2;
        product = "Телевизор LED_SAMSUNG_UE_50_TU_7100";
        System.out.println("Диагональ: " + SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getDiagonal());
        System.out.println("Разрешение: " + SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getResolution());
        System.out.println("Интернет: " + SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getInternetConnection());
        System.out.println("SmartTV: " + SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getSmartTV());
        System.out.println("ВхШхГ: " + SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getDimensions());
        System.out.println("Цена: " + SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getCost());
    }

    public static void LED_SAMSUNG_UE_32_T_4500() {
        amount = 2;
        product = "Телевизор LED_SAMSUNG_UE_32_T_4500";
        System.out.println("Диагональ: " + SamsungTV.LED_SAMSUNG_UE_32_T_4500.getDiagonal());
        System.out.println("Разрешение: " + SamsungTV.LED_SAMSUNG_UE_32_T_4500.getResolution());
        System.out.println("Интернет: " + SamsungTV.LED_SAMSUNG_UE_32_T_4500.getInternetConnection());
        System.out.println("SmartTV: " + SamsungTV.LED_SAMSUNG_UE_32_T_4500.getSmartTV());
        System.out.println("ВхШхГ: " + SamsungTV.LED_SAMSUNG_UE_32_T_4500.getDimensions());
        System.out.println("Цена: " + SamsungTV.LED_SAMSUNG_UE_32_T_4500.getCost());
    }

    public static void LED_SAMSUNG_UE_65_TU_8000() {
        amount = 2;
        product = "Телевизор LED_SAMSUNG_UE_65_TU_8000";
        System.out.println("Диагональ: " + SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getDiagonal());
        System.out.println("Разрешение: " + SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getResolution());
        System.out.println("Интернет: " + SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getInternetConnection());
        System.out.println("SmartTV: " + SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getSmartTV());
        System.out.println("ВхШхГ: " + SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getDimensions());
        System.out.println("Цена: " + SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getCost());
    }

    // Xiaomi
    public static void LED_XIAOMI_Mi_TV_4S_50() {
        amount = 2;
        product = "Телевизор LED_XIAOMI_Mi_TV_4S_50";
        System.out.println("Диагональ: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getDiagonal());
        System.out.println("Разрешение: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getResolution());
        System.out.println("Интернет: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getInternetConnection());
        System.out.println("SmartTV: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getSmartTV());
        System.out.println("ВхШхГ: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getDimensions());
        System.out.println("Цена: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getCost());
    }

    public static void LED_XIAOMI_Mi_TV_4S_65() {
        amount = 2;
        product = "Телевизор LED_XIAOMI_Mi_TV_4S_65";
        System.out.println("Диагональ: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getDiagonal());
        System.out.println("Разрешение: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getResolution());
        System.out.println("Интернет: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getInternetConnection());
        System.out.println("SmartTV: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getSmartTV());
        System.out.println("ВхШхГ: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getDimensions());
        System.out.println("Цена: " + XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getCost());
    }

    public static void ED_XIAOMI_Mi_TV_4S_43() {
        amount = 2;
        product = "Телевизор LED_XIAOMI_Mi_TV_4S_43";
        System.out.println("Диагональ: " + XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getDiagonal());
        System.out.println("Разрешение: " + XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getResolution());
        System.out.println("Интернет: " + XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getInternetConnection());
        System.out.println("SmartTV: " + XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getSmartTV());
        System.out.println("ВхШхГ: " + XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getDimensions());
        System.out.println("Цена: " + XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getCost());
    }

    // LG
    public static void LED_LG_75NANO996NA() {
        amount = 2;
        product = "Телевизор LED_LG_75NANO996NA";
        System.out.println("Диагональ: " + LGTV.LED_LG_75NANO996NA.getDiagonal());
        System.out.println("Разрешение: " + LGTV.LED_LG_75NANO996NA.getResolution());
        System.out.println("Интернет: " + LGTV.LED_LG_75NANO996NA.getInternetConnection());
        System.out.println("SmartTV: " + LGTV.LED_LG_75NANO996NA.getSmartTV());
        System.out.println("ВхШхГ: " + LGTV.LED_LG_75NANO996NA.getDimensions());
        System.out.println("Цена: " + LGTV.LED_LG_75NANO996NA.getCost());
    }

    public static void OLED_LG_55CXRLA() {
        amount = 2;
        product = "Телевизор OLED_LG_55CXRLA";
        System.out.println("Диагональ: " + LGTV.OLED_LG_55CXRLA.getDiagonal());
        System.out.println("Разрешение: " + LGTV.OLED_LG_55CXRLA.getResolution());
        System.out.println("Интернет: " + LGTV.OLED_LG_55CXRLA.getInternetConnection());
        System.out.println("SmartTV: " + LGTV.OLED_LG_55CXRLA.getSmartTV());
        System.out.println("ВхШхГ: " + LGTV.OLED_LG_55CXRLA.getDimensions());
        System.out.println("Цена: " + LGTV.OLED_LG_55CXRLA.getCost());
    }

    public static void LED_LG_65_UN73506LB() {
        amount = 2;
        product = "Телевизор LED_LG_65_UN73506LB";
        System.out.println("Диагональ: " + LGTV.LED_LG_65_UN73506LB.getDiagonal());
        System.out.println("Разрешение: " + LGTV.LED_LG_65_UN73506LB.getResolution());
        System.out.println("Интернет: " + LGTV.LED_LG_65_UN73506LB.getInternetConnection());
        System.out.println("SmartTV: " + LGTV.LED_LG_65_UN73506LB.getSmartTV());
        System.out.println("ВхШхГ: " + LGTV.LED_LG_65_UN73506LB.getDimensions());
        System.out.println("Цена: " + LGTV.LED_LG_65_UN73506LB.getCost());
    }

    public void showInfoTVSamsung() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = SamsungTV.LED_SAMSUNG_UE_50_TU_7100.getCost();
                LED_SAMSUNG_UE_50_TU_7100();
            } else if (model.equals("2")) {
                cost = SamsungTV.LED_SAMSUNG_UE_32_T_4500.getCost();
                LED_SAMSUNG_UE_32_T_4500();
            } else if (model.equals("3")) {
                cost = SamsungTV.LED_SAMSUNG_UE_65_TU_8000.getCost();
                LED_SAMSUNG_UE_65_TU_8000();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public void showInfoTVXiaomi() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = XiaomiTV.LED_XIAOMI_Mi_TV_4S_50.getCost();
                LED_XIAOMI_Mi_TV_4S_50();
            } else if (model.equals("2")) {
                cost = XiaomiTV.LED_XIAOMI_Mi_TV_4S_65.getCost();
                LED_XIAOMI_Mi_TV_4S_65();
            } else if (model.equals("3")) {
                cost = XiaomiTV.ED_XIAOMI_Mi_TV_4S_43.getCost();
                ED_XIAOMI_Mi_TV_4S_43();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public void showInfoTVLG() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = LGTV.LED_LG_75NANO996NA.getCost();
                LED_LG_75NANO996NA();
            } else if (model.equals("2")) {
                cost = LGTV.OLED_LG_55CXRLA.getCost();
                OLED_LG_55CXRLA();
            } else if (model.equals("3")) {
                cost = LGTV.LED_LG_65_UN73506LB.getCost();
                LED_LG_65_UN73506LB();
            } else {
                break;
            }
        } while (1 == 0);
    }

    // Стиральные машины
    // Samsung
    public static void SAMSUNG_WF_8590NLW9DY() {
        amount = 2;
        product = "Стиральная машина: SAMSUNG_WF_8590NLW9DY";
        System.out.println("Класс энергопотребления: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getEnergyClass());
        System.out.println("Класс отжима: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getSpinClass());
        System.out.println("Класс стирки: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getWashingClass());
        System.out.println("Габариты устройства (ВхШхГ), см: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getDimensions());
        System.out.println("Максимальная загрузка, кг: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getMaxLoading());
        System.out.println("Максимальная скорость отжима, об./мин: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getMaxSpinSpeed());
        System.out.println("Тип управления: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getControlType());
        System.out.println("Цена: " + SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getCost());
    }

    public static void SAMSUNG_WW_60K40G09WDLD() {
        amount = 1;
        product = "Стиральная машина: SAMSUNG_WW_60K40G09WDLD";
        System.out.println("Класс энергопотребления: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getEnergyClass());
        System.out.println("Класс отжима: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getSpinClass());
        System.out.println("Класс стирки: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getWashingClass());
        System.out.println("Габариты устройства (ВхШхГ), см: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getDimensions());
        System.out.println("Максимальная загрузка, кг: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getMaxLoading());
        System.out.println("Максимальная скорость отжима, об./мин: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getMaxSpinSpeed());
        System.out.println("Тип управления: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getControlType());
        System.out.println("Цена: " + SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getCost());
    }

    public static void SAMSUNG_WF_60F1R2E2WD() {
        amount = 1;
        product = "Стиральная машина: SAMSUNG_WF_60F1R2E2WD";
        System.out.println("Класс энергопотребления: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getEnergyClass());
        System.out.println("Класс отжима: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getSpinClass());
        System.out.println("Класс стирки: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getWashingClass());
        System.out.println("Габариты устройства (ВхШхГ), см: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getDimensions());
        System.out.println("Максимальная загрузка, кг: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getMaxLoading());
        System.out.println("Максимальная скорость отжима, об./мин: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getMaxSpinSpeed());
        System.out.println("Тип управления: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getControlType());
        System.out.println("Цена: " + SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getCost());
    }

    // LG
    public static void LG_F_1296HDS4() {
        amount = 2;
        product = "Стиральная машина: LG_F_1296HDS4";
        System.out.println("Класс энергопотребления: " + LGWashingMachines.LG_F_1296HDS4.getEnergyClass());
        System.out.println("Класс отжима: " + LGWashingMachines.LG_F_1296HDS4.getSpinClass());
        System.out.println("Класс стирки: " + LGWashingMachines.LG_F_1296HDS4.getWashingClass());
        System.out.println("Габариты устройства (ВхШхГ), см: " + LGWashingMachines.LG_F_1296HDS4.getDimensions());
        System.out.println("Максимальная загрузка, кг: " + LGWashingMachines.LG_F_1296HDS4.getMaxLoading());
        System.out.println("Максимальная скорость отжима, об./мин: " + LGWashingMachines.LG_F_1296HDS4.getMaxSpinSpeed());
        System.out.println("Тип управления: " + LGWashingMachines.LG_F_1296HDS4.getControlType());
        System.out.println("Цена: " + LGWashingMachines.LG_F_1296HDS4.getCost());
    }

    public static void LG_F4_V5RS0W() {
        amount = 2;
        product = "Стиральная машина: LG_F4_V5RS0W";
        System.out.println("Класс энергопотребления: " + LGWashingMachines.LG_F4_V5RS0W.getEnergyClass());
        System.out.println("Класс отжима: " + LGWashingMachines.LG_F4_V5RS0W.getSpinClass());
        System.out.println("Класс стирки: " + LGWashingMachines.LG_F4_V5RS0W.getWashingClass());
        System.out.println("Габариты устройства (ВхШхГ), см: " + LGWashingMachines.LG_F4_V5RS0W.getDimensions());
        System.out.println("Максимальная загрузка, кг: " + LGWashingMachines.LG_F4_V5RS0W.getMaxLoading());
        System.out.println("Максимальная скорость отжима, об./мин: " + LGWashingMachines.LG_F4_V5RS0W.getMaxSpinSpeed());
        System.out.println("Тип управления: " + LGWashingMachines.LG_F4_V5RS0W.getControlType());
        System.out.println("Цена: " + LGWashingMachines.LG_F4_V5RS0W.getCost());
    }

    public static void LG_F_12B8WDS7() {
        amount = 1;
        product = "Стиральная машина: LG_F_12B8WDS7";
        System.out.println("Класс энергопотребления: " + LGWashingMachines.LG_F_12B8WDS7.getEnergyClass());
        System.out.println("Класс отжима: " + LGWashingMachines.LG_F_12B8WDS7.getSpinClass());
        System.out.println("Класс стирки: " + LGWashingMachines.LG_F_12B8WDS7.getWashingClass());
        System.out.println("Габариты устройства (ВхШхГ), см: " + LGWashingMachines.LG_F_12B8WDS7.getDimensions());
        System.out.println("Максимальная загрузка, кг: " + LGWashingMachines.LG_F_12B8WDS7.getMaxLoading());
        System.out.println("Максимальная скорость отжима, об./мин: " + LGWashingMachines.LG_F_12B8WDS7.getMaxSpinSpeed());
        System.out.println("Тип управления: " + LGWashingMachines.LG_F_12B8WDS7.getControlType());
        System.out.println("Цена: " + LGWashingMachines.LG_F_12B8WDS7.getCost());
    }

    public static void showInfoWMsamsung() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = SamsungWashingMachines.SAMSUNG_WF_8590NLW9DY.getCost();
                SAMSUNG_WF_8590NLW9DY();
            } else if (model.equals("2")) {
                cost = SamsungWashingMachines.SAMSUNG_WW_60K40G09WDLD.getCost();
                SAMSUNG_WW_60K40G09WDLD();
            } else if (model.equals("3")) {
                cost = SamsungWashingMachines.SAMSUNG_WF_60F1R2E2WD.getCost();
                SAMSUNG_WF_60F1R2E2WD();
            } else {
                break;
            }
        } while (1 == 0);
    }

    public static void showInfoWMLG() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = LGWashingMachines.LG_F_1296HDS4.getCost();
                LG_F_1296HDS4();
            } else if (model.equals("2")) {
                cost = LGWashingMachines.LG_F4_V5RS0W.getCost();
                LG_F4_V5RS0W();
            } else if (model.equals("3")) {
                cost = LGWashingMachines.LG_F_12B8WDS7.getCost();
                LG_F_12B8WDS7();
            } else {
                break;
            }
        } while (1 == 0);
    }

    // Ноутбуки
    // Asus
    public static void Asus_TUF_Gaming_FX505DT_i7_9750H() {
        amount = 2;
        product = "Игровой Ноутбук: Asus_TUF_Gaming_FX505DT_i7_9750H";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getDiagonal());
        System.out.println("Серия процессора: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getCPUseries());
        System.out.println("Модель процессора: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getHDDcapacity());
        System.out.println("Модель видеокарты: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getOS());
        System.out.println("Цена: " + LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getCost());
    }

    public static void Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H() {
        amount = 1;
        product = "Игровой Ноутбук: Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getDiagonal());
        System.out.println("Серия процессора: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getCPUseries());
        System.out.println("Модель процессора: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getHDDcapacity());
        System.out.println("Модель видеокарты: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getOS());
        System.out.println("Цена: " + LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getCost());
    }

    public static void Asus_ROG_Strix_G15_i7_10750H() {
        amount = 1;
        product = "Игровой Ноутбук: Asus_ROG_Strix_G15_i7_10750H";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getDiagonal());
        System.out.println("Серия процессора: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getCPUseries());
        System.out.println("Модель процессора: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getHDDcapacity());
        System.out.println("Модель видеокарты: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getOS());
        System.out.println("Цена: " + LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getCost());
    }

    public static void showInfoLaptopAsus() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = LaptopACER.Asus_TUF_Gaming_FX505DT_i7_9750H.getCost();
                Asus_TUF_Gaming_FX505DT_i7_9750H();
            } else if (model.equals("2")) {
                cost = LaptopACER.Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H.getCost();
                Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H();
            } else if (model.equals("3")) {
                cost = LaptopACER.Asus_ROG_Strix_G15_i7_10750H.getCost();
                Asus_ROG_Strix_G15_i7_10750H();
            } else {
                break;
            }
        } while (1 == 0);
    }

    // Lenovo

    public static void Lenovo_IdeaPad_3_Ryzen_3_3250U() {
        amount = 1;
        product = "Игровой Ноутбук: Lenovo_IdeaPad_3_Ryzen_3_3250U";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getDiagonal());
        System.out.println("Серия процессора: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getCPUseries());
        System.out.println("Модель процессора: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getHDDcapacity());
        System.out.println("Интегрированное графическое ядро: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getOS());
        System.out.println("Цена: " + LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getCost());
    }

    public static void Lenovo_IdeaPad_3_i3_1005G1() {
        amount = 2;
        product = "Игровой Ноутбук: Lenovo_IdeaPad_3_i3_1005G1";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getDiagonal());
        System.out.println("Серия процессора: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getCPUseries());
        System.out.println("Модель процессора: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getHDDcapacity());
        System.out.println("Интегрированное графическое ядро: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getOS());
        System.out.println("Цена: " + LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getCost());
    }

    public static void Lenovo_IdeaPad_3_Athlon_Silver_3050U() {
        amount = 2;
        product = "Игровой Ноутбук: Lenovo_IdeaPad_3_Athlon_Silver_3050U";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getDiagonal());
        System.out.println("Серия процессора: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getCPUseries());
        System.out.println("Модель процессора: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getHDDcapacity());
        System.out.println("Интегрированное графическое ядро: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getOS());
        System.out.println("Цена: " + LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getCost());
    }

    public static void showInfoLaptopLenovo() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = LaptopLenovo.Lenovo_IdeaPad_3_Ryzen_3_3250U.getCost();
                Lenovo_IdeaPad_3_Ryzen_3_3250U();
            } else if (model.equals("2")) {
                cost = LaptopLenovo.Lenovo_IdeaPad_3_i3_1005G1.getCost();
                Lenovo_IdeaPad_3_i3_1005G1();
            } else if (model.equals("3")) {
                cost = LaptopLenovo.Lenovo_IdeaPad_3_Athlon_Silver_3050U.getCost();
                Lenovo_IdeaPad_3_Athlon_Silver_3050U();
            } else {
                break;
            }
        } while (1 == 0);
    }

    // MacBook
    public static void Apple_MacBook_Air_Retina() {
        amount = 1;
        product = "Ноутбук: Apple_MacBook_Air_Retina";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopMacBook.Apple_MacBook_Air_Retina.getDiagonal());
        System.out.println("Серия процессора: " + LaptopMacBook.Apple_MacBook_Air_Retina.getCPUseries());
        System.out.println("Модель процессора: " + LaptopMacBook.Apple_MacBook_Air_Retina.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopMacBook.Apple_MacBook_Air_Retina.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopMacBook.Apple_MacBook_Air_Retina.getSSDcapacity());
        System.out.println("Интегрированное графическое ядро: " + LaptopMacBook.Apple_MacBook_Air_Retina.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopMacBook.Apple_MacBook_Air_Retina.getOS());
        System.out.println("Цена: " + LaptopMacBook.Apple_MacBook_Air_Retina.getCost());
    }

    public static void Apple_MacBook_Air_13() {
        amount = 1;
        product = "Ноутбук: Apple_MacBook_Air_13";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopMacBook.Apple_MacBook_Air_13.getDiagonal());
        System.out.println("Серия процессора: " + LaptopMacBook.Apple_MacBook_Air_13.getCPUseries());
        System.out.println("Модель процессора: " + LaptopMacBook.Apple_MacBook_Air_13.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopMacBook.Apple_MacBook_Air_13.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopMacBook.Apple_MacBook_Air_13.getSSDcapacity());
        System.out.println("Интегрированное графическое ядро: " + LaptopMacBook.Apple_MacBook_Air_13.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopMacBook.Apple_MacBook_Air_13.getOS());
        System.out.println("Цена: " + LaptopMacBook.Apple_MacBook_Air_13.getCost());
    }

    public static void Apple_MacBook_Pro_Touch_Bar_Retina_2020() {
        amount = 2;
        product = "Ноутбук: Apple_MacBook_Pro_Touch_Bar_Retina_2020";
        System.out.println("Диагональ дисплея, дюйм: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getDiagonal());
        System.out.println("Серия процессора: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getCPUseries());
        System.out.println("Модель процессора: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getCPUmodel());
        System.out.println("Объём оперативной памяти, ГБ: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getRAM());
        System.out.println("Объём HDD накопителя, ГБ: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getSSDcapacity());
        System.out.println("Интегрированное графическое ядро: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getGraphicsCardModel());
        System.out.println("Операционная система: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getOS());
        System.out.println("Цена: " + LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getCost());
    }

    public static void showInfoLaptopMacBook() {
        do {
            System.out.print("Полная характеристика: ");
            Scanner in = new Scanner(System.in);
            String model = in.nextLine();
            if (model.equals("1")) {
                cost = LaptopMacBook.Apple_MacBook_Air_Retina.getCost();
                Apple_MacBook_Air_Retina();
            } else if (model.equals("2")) {
                cost = LaptopMacBook.Apple_MacBook_Air_13.getCost();
                Apple_MacBook_Air_13();
            } else if (model.equals("3")) {
                cost = LaptopMacBook.Apple_MacBook_Pro_Touch_Bar_Retina_2020.getCost();
                Apple_MacBook_Pro_Touch_Bar_Retina_2020();
            } else {
                break;
            }
        } while (1 == 0);
    }
}