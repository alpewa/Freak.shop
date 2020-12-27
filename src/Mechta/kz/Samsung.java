package Mechta.kz;

public enum Samsung {
    A51("2400×1080px", "2300/ 1700 МГц", 8, 128, "FaceID", 4000, 129890),
    A10("1520х720px", "1600/ 1350 МГц", 8, 32, "FaceID", 3400, 49890),
    S10("3040х1440px", "Exynos 9820", 8, 128, "FaceID", 3400, 229890);

    private String display;
    private String CPU;
    private int RAM;
    private int storage;
    private String authenticator;
    private int battery;
    private int cost;

    Samsung(String display, String CPU, int RAM, int storage, String authenticator, int battery, int cost) {
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