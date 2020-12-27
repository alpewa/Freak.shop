package Mechta.kz;

public enum Iphone {
    IphoneXS("1125x2436 px", "A12 Bionic 6 core 2.5 Ггц" ,4,512,"FaceID",2658,725990),
    IphoneX("1125x2436 px", "A11 Bionic 6 core 2.39 Ггц" ,3,256,"FaceID",2716,485990),
    Iphone11pro("1125x2436 px", "A13 Bionic 6 core 2.65 Ггц" ,4,512,"FaceID",3046,619900),
    Iphone12pro("1170x2532 px", "A14 Bionic 6 core" ,4,256,"FaceID",2815,529800),
    IphoneSE2("750x1334 px", "A13 Bionic 6 core 2.65 Ггц" ,3,128,"touchID",1821,235000);

    private String display;
    private String CPU;
    private int RAM;
    private int storage;
    private String authenticator;
    private int battery;
    private int cost;

    Iphone(String display, String CPU, int RAM, int storage, String authenticator, int battery, int cost) {
        this.display = display;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.authenticator = authenticator;
        this.battery = battery;
        this.cost = cost;
    }

    public String getDisplay() {
        return display;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public String getAuthenticator() {
        return authenticator;
    }

    public int getBattery() {
        return battery;
    }

    public int getCost() {
        return cost;
    }
}