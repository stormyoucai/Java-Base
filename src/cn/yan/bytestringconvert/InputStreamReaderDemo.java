package cn.yan.bytestringconvert;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/14.
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");

        Reader reader = new InputStreamReader(new FileInputStream(file));
        char[] c = new char[1024];
        int len = reader.read(c);
        reader.close();

        System.out.println(new String(c,0,len));
    }
}
