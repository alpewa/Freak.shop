package Mechta.kz;

public enum XiaomiTV {
    LED_XIAOMI_Mi_TV_4S_50(50, "4К UHD (3840x2160)", "есть", "нет", "64.7х112.2х28.5", 194990),
    LED_XIAOMI_Mi_TV_4S_65(65, "4К UHD (3840x2160)", "есть", "есть", "90.7х144.9х31.9", 318990),
    ED_XIAOMI_Mi_TV_4S_43(43, "4К UHD (3840x2160)", "есть", "есть", "61.3х96.3х21.4", 149990);

    private int diagonal;
    private String resolution;
    private String internetConnection;
    private String smartTV;
    private String dimensions;
    private int cost;

    XiaomiTV(int diagonal, String resolution, String internetConnection, String smartTV, String dimensions, int cost) {
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.internetConnection = internetConnection;
        this.smartTV = smartTV;
        this.dimensions = dimensions;
        this.cost = cost;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public String getInternetConnection() {
        return internetConnection;
    }

    public String getSmartTV() {
        return smartTV;
    }

    public String getDimensions() {
        return dimensions;
    }

    public int getCost() {
        return cost;
    }

}