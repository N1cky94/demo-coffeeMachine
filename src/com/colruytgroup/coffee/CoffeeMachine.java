package com.colruytgroup.coffee;

public class CoffeeMachine {
    // FIELDS
    private int water;
    private int coffeeBeans;
    private int milk;
    private int sugar;
    private int cups;
    private String name;

    // CONSTRUCTOR
    public CoffeeMachine(
            int water,
            int coffeeBeans,
            int milk,
            int sugar,
            int cups
    ) {
        this(
                water,
                coffeeBeans,
                milk,
                sugar,
                cups,
                "Coffee Machine"
        );
    }

    public CoffeeMachine(
            int water,
            int coffeeBeans,
            int milk,
            int sugar,
            int cups,
            String name
    ) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
        this.sugar = sugar;
        this.cups = cups;
        this.name = name;
    }

    public CoffeeMachine(CoffeeMachine otherMachine) {
        this(
                otherMachine.water,
                otherMachine.coffeeBeans,
                otherMachine.milk,
                otherMachine.sugar,
                otherMachine.cups,
                otherMachine.name
        );
    }

    // MUTATORS
    public void setWater(int water) {
        this.water = Math.abs(water);
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ACCESSORS
    public int getWater() {
        return water;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public int getSugar() {
        return sugar;
    }

    public int getCups() {
        return cups;
    }

    public String getName() {
        return name;
    }

    // METHODS
    public boolean hasEnoughResources(CoffeeType type) {
        return this.water >= type.getWaterNeeded()
            && this.coffeeBeans >= type.getCoffeeBeansNeeded()
            && this.milk >= type.getMilkNeeded()
            && this.sugar >= type.getSugarNeeded()
            && this.cups >= type.getCupsNeeded();
    }

    public void makeCoffee(CoffeeType type) {
        this.water -= type.getWaterNeeded();
        this.coffeeBeans -= type.getCoffeeBeansNeeded();
        this.milk -= type.getMilkNeeded();
        this.sugar -= type.getSugarNeeded();
        this.cups -= type.getCupsNeeded();
    }

    @Override
    public String toString() {
        return "Coffee Machine\n" +
                "Water: " + water + "\n" +
                "Coffee Beans: " + coffeeBeans + "\n" +
                "Milk: " + milk + "\n" +
                "Sugar: " + sugar + "\n" +
                "Cups: " + cups + "\n" +
                "Name: " + name + "\n";
    }
}
