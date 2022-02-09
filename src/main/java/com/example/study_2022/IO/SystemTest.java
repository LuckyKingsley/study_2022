package com.example.study_2022.IO;

import java.io.*;
import java.util.Scanner;

/**
 * @author JinXin
 * @description
 * @date 2022/02/09 15:54
 **/
public class SystemTest {

    public static void main(String[] args) {
        test2();
    }

    private static void test() {
        System.err.println();
        System.out.println();
//        System.in.read()
        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt()
//        Scanner scanner1 = new Scanner(new FilterInputStream("d.jpg"));
    }

    private static void test2() {
        InputStream inputStream = System.in;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        byte[] bytes = new byte[1024 * 100];

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e.txt")));

            String s = bufferedReader.readLine();
            if (null != s) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                s = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}