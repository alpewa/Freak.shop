package Mechta.kz;

public enum LaptopMacBook {
    Apple_MacBook_Air_Retina(13, "Intel Core i3", "1000NG4", 8, 256, "Intel Iris Plus Graphics", "Mac OS Catalina", 549990),
    Apple_MacBook_Air_13(13, "Intel Core i5", "1030NG7", 8, 512, "Intel Iris Plus Graphics", "Mac OS Catalina", 649990),
    Apple_MacBook_Pro_Touch_Bar_Retina_2020(13, "Intel Core i5", "1038NG7", 16, 512, "\n" +
            "Intel Iris Graphics", "Mac OS", 1011990);

    private int diagonal;
    private String CPUseries;
    private String CPUmodel;
    private int RAM;
    private int SSDcapacity;
    private String graphicsCardModel;
    private String OS;
    private int cost;

    LaptopMacBook(int diagonal, String CPUseries, String CPUmodel, int RAM, int SSDcapacity, String graphicsCardModel, String OS, int cost) {
        this.diagonal = diagonal;
        this.CPUseries = CPUseries;
        this.CPUmodel = CPUmodel;
        this.RAM = RAM;
        this.SSDcapacity = SSDcapacity;
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

    public int getSSDcapacity() {
        return SSDcapacity;
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