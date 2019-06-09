package com.automatization.training.classes3.targil1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileTxtReaderTest {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("/Users/alenka/Documents/Lena.txt"))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Elena")) {
                    sb.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(sb);
    }
}
