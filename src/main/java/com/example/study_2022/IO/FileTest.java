package com.example.study_2022.IO;

import java.io.File;
import java.io.IOException;

/**
 * @author JinXin
 * @description
 * @date 2022/02/09 14:59
 **/
public class FileTest {

    public static void main(String[] args) {
        testFile();
    }

    private static void testFile() {
        File file = new File("aaa.txt");
        File file1 = null;
        try {
            file1 = file.getCanonicalFile();
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.canRead());
        System.out.println(file.getAbsolutePath()); // 绝对路径
        System.out.println(file.getPath()); // 相对路径
        System.out.println(file.getName());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
    }

    private static void testDir() {
        File file = new File("aaa.txt");
        File file1 = null;
        try {
            file1 = file.getCanonicalFile();
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.list());
    }

}