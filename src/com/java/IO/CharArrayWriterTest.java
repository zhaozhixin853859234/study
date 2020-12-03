package com.java.IO;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-05 15:43
 */
public class CharArrayWriterTest {
    public static void main(String[] args) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("nihao");
        writer.write("你好");

        char[] buff = writer.toCharArray();
        System.out.println(new String(buff));

        writer.close();


    }
}
