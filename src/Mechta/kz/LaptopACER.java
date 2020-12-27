package Mechta.kz;

public enum LaptopACER {
    Asus_TUF_Gaming_FX505DT_i7_9750H(15,"Intel Core i7","9750H",16,1000,"nVidia GeForce GTX1060","DOS",439990),
    Asus_TUF_Gaming_FX505DT_Ryzen_5_3550H(15,"AMD Ryzen 5","3550H",8,1000,"nVidia GeForce GTX1650","Windows 10",334990),
    Asus_ROG_Strix_G15_i7_10750H(15,"Intel Core i7","10750H",16,1000,"nVidia GeForce RTX2070","DOS",699990);

    private int diagonal;
    private String CPUseries;
    private String CPUmodel;
    private int RAM;
    private int HDDcapacity;
    private String graphicsCardModel;
    private String OS;
    private int cost;

    LaptopACER(int diagonal, String CPUseries, String CPUmodel, int RAM, int HDDcapacity, String graphicsCardModel, String OS,int cost) {
        this.diagonal = diagonal;
        this.CPUseries = CPUseries;
        this.CPUmodel = CPUmodel;
        this.RAM = RAM;
        this.HDDcapacity = HDDcapacity;
        this.graphicsCardModel = graphicsCardModel;
        this.OS = OS;
        this.cost = cost;
    }
    public int getCost(){
        return cost;
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
}
