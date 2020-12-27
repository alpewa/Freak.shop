package Mechta.kz;

public enum SamsungWashingMachines {
    SAMSUNG_WF_8590NLW9DY("A+", "C", "A", "85х60х45", 6, 1000, "электронный", 124990),
    SAMSUNG_WW_60K40G09WDLD("A+++", "B", "A", "85х60х45", 6, 1000, "электронный", 159990),
    SAMSUNG_WF_60F1R2E2WD("A++", "B", "A", "85х60х45", 6, 1200, "электронный", 99990);

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

    SamsungWashingMachines(String energyClass, String spinClass, String washingClass, String dimensions, int maxLoading, int maxSpinSpeed, String controlType, int cost) {
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