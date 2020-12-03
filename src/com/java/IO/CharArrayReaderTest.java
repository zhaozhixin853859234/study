package com.java.IO;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-05 15:25
 */
public class CharArrayReaderTest {
    public static void main(String[] args) throws IOException {
        char[] c = {'z','中','1','#'};
        CharArrayReader charArrayReader = new CharArrayReader(c);
        int data = charArrayReader.read();
        while (data!=-1){
            System.out.print((char) data+" ");
            // 返回
            System.out.print(data+" ");
            data = charArrayReader.read();
        }
        charArrayReader.close();

    }
}
