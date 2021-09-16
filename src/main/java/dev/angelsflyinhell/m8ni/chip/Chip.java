package dev.angelsflyinhell.m8ni.chip;

import dev.angelsflyinhell.m8ni.chip.utils.Console;
import dev.angelsflyinhell.m8ni.chip.utils.Handler;

import java.util.HashMap;

public class Chip {

    private static HashMap<Integer, String> script;
    private static HashMap<Integer, Integer> data;
    private static int bitSize = 8;

    public Chip(HashMap<Integer, String> instructions, HashMap<Integer, Integer> dataset) {
        script = instructions;
        data = dataset;
    }

    public void putInstructionMap(HashMap<Integer, String> instructions) {
        script = instructions;
    }

    public int getBitSize() {
        return bitSize;
    }

    public void setBitSize(int bits) {
        bitSize = bits;
    }

    public HashMap<Integer, String> getInstructionMap() {
        return script;
    }

    public void run() {

        Console.printConfig(bitSize, data);

        int iteration = 0;
        for (int i = 0; i < script.size(); i++) {

            String cmd = script.get(i);
            String[] args = Handler.getArgs(cmd);

            switch (Handler.split(cmd)[0]) {
                case "INC":
                    int base = data.get(Integer.parseInt(args[0]));
                    base = base + 1;
                    data.put(Integer.valueOf(args[0]), base);
                    break;
                case "DEC":
                    base = data.get(Integer.parseInt(args[0]));
                    base = base - 1;
                    data.put(Integer.valueOf(args[0]), base);
                    break;
                case "JUMP":
                    i = Integer.parseInt(args[0]) - 2;
                    break;
                case "STOP":
                    i = script.size() + 1;
                break;
                case "IS_ZERO":
                    if (data.get(Integer.parseInt(args[0])) == 0)
                        i = Integer.parseInt(args[1]) - 2;
                break;
            }
            iteration++;
            Console.printI(iteration, cmd, data);
        }
    }

}
