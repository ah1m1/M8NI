package dev.angelsflyinhell.m8ni.chip.utils;

public class Handler {

    public static String[] split(String line) {
        return line.split(" ");
    }

    public static String[] getArgs(String line) {
        String cmd = split(line)[0] + " ";
        return line.replace(cmd, "").split(" ");
    }

}
