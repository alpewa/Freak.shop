package Mechta.kz;

public enum Huawei{
    P30("2340х1080 px", "Hisilicon Kirin 980" ,8,128,"FingerScanner",3650,249890),
    Mate30Pro("2400х1176 px", "Hisilicon Kirin 990" ,8,256,"FaceID , FingerScanner",4500,449890),
    P40pro("2640х1200 px", "Hisilicon Kirin 990 5G" ,8,256,"FaceID , FingerScanner",4200,449890);

    private String display;
    private String CPU;
    private int RAM;
    private int storage;
    private String authenticator;
    private int battery;
    private int cost;

    Huawei(String display, String CPU, int RAM, int storage, String authenticator, int battery, int cost) {
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
