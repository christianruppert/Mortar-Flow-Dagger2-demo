package com.lukaspili.mortardemo.utils;

public class StringUtils {
    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }
}
