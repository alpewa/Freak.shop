package Mechta.kz;

public enum LGTV {
    LED_LG_75NANO996NA(75, "8K (7680 x 4320)", "есть", "есть", "102.1х167.2х36.1", 1899990),
    OLED_LG_55CXRLA(55, "4К UHD (3840x2160)", "есть", "есть", "73.8х122.8х25.1", 649990),
    LED_LG_65_UN73506LB(65, "4К UHD (3840x2160)", "есть", "есть", "91х146.3х27.1", 299990);

    private int diagonal;
    private String resolution;
    private String internetConnection;
    private String smartTV;
    private String dimensions;
    private int cost;

    LGTV(int diagonal, String resolution, String internetConnection, String smartTV, String dimensions, int cost) {
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