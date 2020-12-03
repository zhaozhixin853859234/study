package com.java.IO;

import java.io.*;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-05 16:06
 */
public class StandardInTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(reader);
        String data;
        while ((data=br.readLine())!=null && !data.equals("exit")){
            System.out.println("print:"+data);
            PrintWriter pw = new PrintWriter(System.out,true);
            pw.println(br);
        }


    }
}
