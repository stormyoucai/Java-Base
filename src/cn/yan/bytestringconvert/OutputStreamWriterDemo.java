package cn.yan.bytestringconvert;

/**
 * Created by yanchongsheng on 2017/12/14.
 */

import java.io.*;

/**
 * 字符流转字节流，然后输出
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        OutputStream output = new FileOutputStream(file);

        String str = "Hello yan.chongsheng";
        Writer writer = new OutputStreamWriter(output);
        writer.write(str);

        writer.close();
        output.close();
    }
}
