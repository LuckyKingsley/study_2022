package com.example.study_2022.IO;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author JinXin
 * @description
 * @date 2022/02/07 16:23
 **/

@Slf4j
public class IOTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        File writeFile = new File("bbb.txt");

        try {
            Path path = FileSystems.getFileSystem(new URI("aaa.txt")).getPath()
            byte[] bytes = Files.readAllBytes();
            inputStream = new FilterInputStream();
            outputStream = new FileOutputStream(file);

            outputStream.write(98);
            outputStream.write("jinxin".getBytes());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}