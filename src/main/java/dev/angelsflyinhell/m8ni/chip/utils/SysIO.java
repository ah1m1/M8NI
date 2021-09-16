package dev.angelsflyinhell.m8ni.chip.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SysIO {

    public static HashMap<Integer, String> getInstructionMap(String path) throws IOException {
        HashMap<Integer, String> instructions = new HashMap<Integer, String>();

        int line = 0;
        FileInputStream fstream = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;

        while ((strLine = br.readLine()) != null)   {
            instructions.put(line, strLine);
            line++;
        }

        fstream.close();
        return instructions;
    }

}
