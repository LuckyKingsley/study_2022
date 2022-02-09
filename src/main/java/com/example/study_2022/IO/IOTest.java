package com.example.study_2022.IO;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author JinXin
 * @description
 * @date 2022/02/07 16:23
 **/

@Slf4j
public class IOTest {

    public static void main(String[] args) {
//        testAdapterInputStreamReader();
        testAdapterOutputStreamWriter();
    }

    private static void testStream() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        File writeFile = new File("bbb.txt");


        try {// E:\idea_workspace\study_2022
            Path path = FileSystems.getDefault().getPath("E:", "idea_workspace", "study_2022", "aaa.txt");
            byte[] bytes = Files.readAllBytes(path);
            inputStream = new ByteArrayInputStream(bytes);
            outputStream = new FileOutputStream(writeFile);

            int nRead;
            byte[] data = new byte[1024];
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                outputStream.write(data, 0, nRead);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void testWrite() {

        Scanner scanner = new Scanner(System.in);

    }

    private static void test() {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(fileInputStream));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void testAdapterInputStreamReader() {
        char[] cbuf = new char[256];
        int n = 0;
        Reader reader = new InputStreamReader(System.in);

        try {
            n = reader.read(cbuf);
        } catch (Exception e) {

        }
        System.out.println(cbuf[0]);
    }

    private static void testAdapterOutputStreamWriter() {
        Reader reader = null;
        Writer writer = null;
        char[] chars = new char[1024];
        int n = 0;
        int m = 0;

        try {
            reader = new InputStreamReader(new FileInputStream("aaa.txt"));
            while ((n = reader.read(chars, 0, chars.length)) != -1) {
                reader.read(chars, 0, n);
            }

            writer = new OutputStreamWriter(new FileOutputStream("bbb.txt"));
            writer.write(chars, 0, chars.length);

        } catch (Exception e) {

        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void testAdapter() {
        

    }


}