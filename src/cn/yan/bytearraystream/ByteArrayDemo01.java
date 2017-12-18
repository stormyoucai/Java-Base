package cn.yan.bytearraystream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/18.
 */
public class ByteArrayDemo01 {
    public static void main(String[] args) throws IOException {
        String str = "HELLO WORLD";
        InputStream input = new ByteArrayInputStream(str.getBytes());   //写入内存，通过new方法
        OutputStream output = new ByteArrayOutputStream();

        int temp = 0;
        while ( (temp = input.read()) != -1 ){
            char c = Character.toLowerCase((char) temp);
            output.write(c);
        }
        String lower = output.toString();
        System.out.println(lower);

        input.close();
        output.close();
    }
}
