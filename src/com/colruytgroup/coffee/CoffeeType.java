package com.colruytgroup.coffee;

public enum CoffeeType {
    STANDARD_WITH_MILK_AND_SUGAR(100, 5, 5, 2),
    STANDARD_WITH_MILK(100, 5, 5, 0),
    STANDARD_WITH_SUGAR(100, 5, 0, 2),
    STANDARD(100, 5, 0, 0),
    CAPPUCCINO(50, 5, 50, 0),
    ESPRESSO(50, 7, 0, 0),
    LATTE(25, 5, 75, 0);

    private final int waterNeeded;
    private final int coffeeBeansNeeded;
    private final int milkNeeded;
    private final int sugarNeeded;
    private final int cupsNeeded = 1;

    CoffeeType(int waterNeeded, int coffeeBeansNeeded, int milkNeeded, int sugarNeeded) {
        this.waterNeeded = waterNeeded;
        this.coffeeBeansNeeded = coffeeBeansNeeded;
        this.milkNeeded = milkNeeded;
        this.sugarNeeded = sugarNeeded;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getCoffeeBeansNeeded() {
        return coffeeBeansNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getSugarNeeded() {
        return sugarNeeded;
    }

    public int getCupsNeeded() {
        return cupsNeeded;
    }
}
