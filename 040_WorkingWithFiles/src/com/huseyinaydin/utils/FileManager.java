package com.huseyinaydin.utils;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    public static void createNewFile(String fileName){
        File file = new File(fileName);
        try {
            if (file.createNewFile())
                System.out.println("Dosya oluşturuldu");
            else
                System.out.println("Dosya oluşturulamadı");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(String fileName){
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("Dosya adı " + file.getName());
            System.out.println("Dosya yolu " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? " + file.canWrite());
            System.out.println("Dosya okunabilir mi? " + file.canRead());
            System.out.println("Dosya çalıştırılabilir mi? " + file.canExecute());
            System.out.println("Dosya boyutu(byte) " + file.length());
        }
    }

    public static void fileRead(String fileName){
        File file = new File(fileName);
        Scanner scanner = null;
        if (file.exists()){
            try {
                scanner = new Scanner(file);
                String line = "";
                while (scanner.hasNextLine()){
                    line = scanner.nextLine();
                }
                System.out.println(line);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                scanner.close();
            }
        }
    }

    public static void fileWrite(String fileName,String[] fileData){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(fileName),true));
            for (String line: fileData) {
                bufferedWriter.newLine();
                bufferedWriter.write(line);
            }
            System.out.println("Dosya yazıldı");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
