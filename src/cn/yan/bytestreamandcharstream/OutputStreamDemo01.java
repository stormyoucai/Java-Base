package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/11.
 */
public class OutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        OutputStream out = new FileOutputStream(file);
        String str = "Hello World";
        byte[] b = str.getBytes();
        out.write(b);
        out.close();
    }
}
