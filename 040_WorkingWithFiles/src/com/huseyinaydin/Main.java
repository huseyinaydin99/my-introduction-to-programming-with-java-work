package com.huseyinaydin;

import com.huseyinaydin.utils.FileManager;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileManager.createNewFile("C:\\test\\test.txt");
        FileManager.getFileInfo("C:\\test\\test.txt");
        FileManager.fileWrite("C:\\test\\test.txt",new String[]{"Hüseyin","Rümeysa","Yasin","Ömer Faruk"});
        FileManager.fileRead("C:\\test\\test.txt");
    }
}
