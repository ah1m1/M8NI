package dev.angelsflyinhell.m8ni.chip.utils;

import dev.angelsflyinhell.m8ni.chip.Router;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Console {

    public static void printConfig(int bitSize, HashMap<Integer, Integer> data) {
        System.out.println("Chip Config {");
        System.out.println("    memory: " + bitSize + " bits");
        System.out.println("    dataset: " + data);
        System.out.println("}");
    }

    public static void printI(int i, String command, HashMap<Integer, Integer> data) {
        System.out.println("Iteration " + i + " {");
        System.out.println("    command: " + command);
        System.out.println("    dataset: " + data);
        System.out.println("}");
    }

    public static void printStartup() {
        System.out.println("    __  _______  _   ______\n" +
                "   /  |/  ( __ )/ | / /  _/\n" +
                "  / /|_/ / __  /  |/ // /  \n" +
                " / /  / / /_/ / /|  // /   \n" +
                "/_/  /_/\\____/_/ |_/___/   \n" +
                "                           ");
        System.out.println("Script-Parser for low-level, bit-limited programming.");
        System.out.println("(C)(P) angelsflyinhell & AH1M1");
    }

    public static void inputAwaiter() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("M8NI/>");
        Router.defaultRouter(br.readLine());
        inputAwaiter();
    }
}
