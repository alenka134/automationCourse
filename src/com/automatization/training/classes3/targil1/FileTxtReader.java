package com.automatization.training.classes3.targil1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTxtReader {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alenka/Documents/Lena.txt"))) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                boolean elena = line.contains("Elena");
                if (elena == true) {
                    sb.append(line).append("\n");
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println(sb);
    }
}
