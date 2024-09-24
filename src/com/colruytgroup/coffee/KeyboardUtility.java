package com.colruytgroup.coffee;

import java.util.Scanner;

public class KeyboardUtility {
    private static final Scanner KEYBOARD = new Scanner(System.in);

    private KeyboardUtility() {
        // Do Not Dear To Implement !
    }

    public static String getInput(String message) {
        System.out.println(message);
        return KEYBOARD.nextLine();
    }

    public static int getIntInput(String message) {
        System.out.println(message);
        String inputToBeCastToInt = KEYBOARD.nextLine();
        return Integer.parseInt(inputToBeCastToInt);
    }


}
