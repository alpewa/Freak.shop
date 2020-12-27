package Mechta.kz;

public enum Xiaomi {
    RedmiNote9("2340х1080 px", "Mediatek Helio G85", 8, 128, "FaceID , FingerScanner", 5020, 99990),
    RedmiNote9Pro("2400х1080 px", "Qualcomm Snapdragon 720G", 8, 128, "FaceID, FingerScanner", 5020, 129990),
    Redmi9A("1600х720 px", "Mediatek Helio G25", 8, 32, "отсутсвует", 5000, 43990);

    private String display;
    private String CPU;
    private int RAM;
    private int storage;
    private String authenticator;
    private int battery;
    private int cost;

    Xiaomi(String display, String CPU, int RAM, int storage, String authenticator, int battery, int cost) {
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