package Mechta.kz;

public enum LGWashingMachines {
    LG_F_1296HDS4("A", "B", "A", "85х60х44", 7, 1200, "электромеханический", 149990),
    LG_F4_V5RS0W("A", "A", "A", "85х60х56", 10, 1400, "электромеханический", 289990),
    LG_F_12B8WDS7("A", "B", "A", "85х60х44", 6, 1200, "электронный", 129990);

    private String energyClass;
    private String spinClass;
    private String washingClass;
    private String dimensions;
    private int maxLoading;
    private int maxSpinSpeed;
    private String controlType;
    private int cost;

    public String getEnergyClass() {
        return energyClass;
    }

    public String getSpinClass() {
        return spinClass;
    }

    public String getWashingClass() {
        return washingClass;
    }

    public String getDimensions() {
        return dimensions;
    }

    public int getMaxLoading() {
        return maxLoading;
    }

    public int getMaxSpinSpeed() {
        return maxSpinSpeed;
    }

    public String getControlType() {
        return controlType;
    }

    public int getCost() {
        return cost;
    }

    LGWashingMachines(String energyClass, String spinClass, String washingClass, String dimensions, int maxLoading, int maxSpinSpeed, String controlType, int cost) {
        this.energyClass = energyClass;
        this.spinClass = spinClass;
        this.washingClass = washingClass;
        this.dimensions = dimensions;
        this.maxLoading = maxLoading;
        this.maxSpinSpeed = maxSpinSpeed;
        this.controlType = controlType;
        this.cost = cost;
    }
}