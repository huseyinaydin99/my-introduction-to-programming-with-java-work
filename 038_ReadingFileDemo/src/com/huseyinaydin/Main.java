package com.huseyinaydin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\yedek workspace\\038_ReadingFileDemo\\src\\sayilar.txt"));
            String s = "";
            String total = "";
            while ((s = bufferedReader.readLine())!=null){
                total += s;
            }
            String[] stringArray = total.split("-");
            Arrays.stream(stringArray).forEach(i-> System.out.println(i));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("Bitti!");
        }
    }
}
