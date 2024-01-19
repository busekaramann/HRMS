package com.buse.HRMS.core.utilities.method;

public class MethodUtils {

    public static int generateRandomSixCharacter() {
        return (int) (Math.random() * (999999-100000 -1)) + 100000;
    }
}
