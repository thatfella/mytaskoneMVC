package com.checking.thatfella.checkers;

/**
 * Created by ESALE on 08.11.2016.
 */
public class IsBoringChecker implements NumChecker {

    public String check(int num) {
        String result;
        if (num > 1000000) {
            result = "Is Boring";
            System.out.println(result);
        } else {
            result = "Is NOT Boring";
            System.out.println(result);
        }
        return result;
    }
}
