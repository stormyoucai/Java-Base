package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/11.
 */
public class OutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        OutputStream out = new FileOutputStream(file,true); //在文件末尾追加内容
        String str = "\r\nHi";
        byte[] b = str.getBytes();
        for(byte each : b) {
            out.write(each);
        }
        out.close();
    }
}
