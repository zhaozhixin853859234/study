package com.java.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-05 09:44
 */

public class ByteArrayInputStreamTest {
    public static void main(String[] args) throws IOException {
        byte[] b = {2,3,4,-1,-2,-3,-127,7};
        // 适配器，将字节数组转换为InputStream类型，可以使用InputStream进行输入流操作
        ByteArrayInputStream in = new ByteArrayInputStream(b);
        int data = in.read();
        while (data!=-1){
            System.out.println(data+" ");
            data = in.read();
        }
        in.close();
    }
}
