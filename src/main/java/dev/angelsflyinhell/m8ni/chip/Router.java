package dev.angelsflyinhell.m8ni.chip;

import dev.angelsflyinhell.m8ni.chip.utils.Dataset;
import dev.angelsflyinhell.m8ni.chip.utils.SysIO;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Router {

    public static void defaultRouter(String in) {
        String[] args = in.split(" ");

        try {
            Chip m8ni = new Chip(SysIO.getInstructionMap(args[0]), Dataset.createDataset(Integer.parseInt(args[1])));
            m8ni.setBitSize(16);
            m8ni.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
