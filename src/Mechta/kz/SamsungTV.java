package Mechta.kz;

public enum SamsungTV {
    LED_SAMSUNG_UE_50_TU_7100(50, "4К UHD (3840x2160)", "есть", "есть", "71.3х111.6х24.9", 219990),
    LED_SAMSUNG_UE_32_T_4500(32, "HD (1366х768)", "есть", "есть", "90.6х144.9х28.2", 119990),
    LED_SAMSUNG_UE_65_TU_8000(65, "4К UHD (3840x2160)", "есть", "есть", "46.5х73.7х15", 329990);

    private int diagonal;
    private String resolution;
    private String internetConnection;
    private String smartTV;
    private String dimensions;
    private int cost;

    SamsungTV(int diagonal, String resolution, String internetConnection, String smartTV, String dimensions, int cost) {
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