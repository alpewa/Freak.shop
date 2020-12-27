package Mechta.kz;

public enum LaptopLenovo {
    Lenovo_IdeaPad_3_Ryzen_3_3250U(15, "AMD Ryzen 3", "3250U", 8, 1000, "AMD Radeon Graphics", "Windows 10", 209990),
    Lenovo_IdeaPad_3_i3_1005G1(15, "Intel Core i3", "1005G1", 4, 1000, "Intel UHD Graphics", "Windows 10", 199990),
    Lenovo_IdeaPad_3_Athlon_Silver_3050U(15, "Athlon Silver", "3050U", 4, 1000, "AMD Radeon Graphics", "Windows 10", 189990);

    private int diagonal;
    private String CPUseries;
    private String CPUmodel;
    private int RAM;
    private int HDDcapacity;
    private String graphicsCardModel;
    private String OS;
    private int cost;

    LaptopLenovo(int diagonal, String CPUseries, String CPUmodel, int RAM, int HDDcapacity, String graphicsCardModel, String OS, int cost) {
        this.diagonal = diagonal;
        this.CPUseries = CPUseries;
        this.CPUmodel = CPUmodel;
        this.RAM = RAM;
        this.HDDcapacity = HDDcapacity;
        this.graphicsCardModel = graphicsCardModel;
        this.OS = OS;
        this.cost = cost;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getCPUseries() {
        return CPUseries;
    }

    public String getCPUmodel() {
        return CPUmodel;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHDDcapacity() {
        return HDDcapacity;
    }

    public String getGraphicsCardModel() {
        return graphicsCardModel;
    }

    public String getOS() {
        return OS;
    }

    public int getCost() {
        return cost;
    }
}