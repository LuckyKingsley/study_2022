package com.example.study_2022.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author JinXin
 * @description
 * @date 2022/02/09 16:46
 **/
public class DataTest {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        DataOutputStream dataOutputStream = null;

        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream("f.txt"));
            dataOutputStream.writeInt(112345);

        } catch (IOException e) {

        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}