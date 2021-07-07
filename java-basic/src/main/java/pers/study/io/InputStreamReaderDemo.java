package pers.study.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import pers.study.config.Constants;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(Constants.PATH),"utf-8");
        int len;
        while ((len = reader.read()) != -1) {
            System.out.print((char) len);
        }
        reader.close();
    }
}
