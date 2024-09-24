package com.colruytgroup.coffee;

import static com.colruytgroup.coffee.KeyboardUtility.getInput;
import static com.colruytgroup.coffee.KeyboardUtility.getIntInput;

public class MainMenu {
    private final CoffeeMachine machine = new CoffeeMachine(100, 50, 100, 50, 5);
    public void start() {
        System.out.println("Welcome to the Coffee Machine!");

        String answer;

        do {
            answer = getInput("What do you want to do? (buy - fill - take - exit)");

            if (answer.equalsIgnoreCase("buy")) {
                buyCoffee();
            }

        } while (!answer.equals("exit"));


        System.out.println("Thank you, come again!");
    }

    private void buyCoffee() {
        StringBuilder typeChoices = new StringBuilder("What type of coffee do you want?\n");
        for (int i = 0; i < CoffeeType.values().length; i++) {
            typeChoices.append((i + 1))
                    .append(". ")
                    .append(CoffeeType.values()[i])
                    .append("\n");
        }

        int typeAnswer = getIntInput(typeChoices.toString());
        CoffeeType type = CoffeeType.values()[typeAnswer - 1];

        if (machine.hasEnoughResources(type)) {
            machine.makeCoffee(type);
        } else {
            System.out.println("Sorry, you don't have enough resources.");
        }

        System.out.println(machine);
    }
}
