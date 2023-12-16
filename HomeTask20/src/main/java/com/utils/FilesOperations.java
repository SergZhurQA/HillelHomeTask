package com.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class FilesOperations {

    public static boolean fileIsDownload(String filePath, int durationSec) {
        File file = new File(filePath);
        int counter = 0;

        while (!file.exists() && counter <= durationSec) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;

        }
        return file.exists();
    }

    public static boolean fileIsEmpty(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath)).isEmpty();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean fileExtensionIsCorrect(String filePath, String extension) {
        return new File(filePath).getName().endsWith(extension);
    }

    public static List<String> readAllFileContent(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> getAllHeaders(String filePath) {
        try {
            return Arrays.asList(Files.readAllLines(Paths.get(filePath)).get(0).split(","));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> getRowByNumber(String filePath, int rowNumber) {
        try {
            return Arrays.asList(Files.readAllLines(Paths.get(filePath)).get(rowNumber).split(","));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
