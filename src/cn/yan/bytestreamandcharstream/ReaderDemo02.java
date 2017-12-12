package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/12.
 */
public class ReaderDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        Reader reader = new FileReader(file);

        char[] c = new char[1024];
        int temp = 0;
        int len = 0;
        while( (temp = reader.read()) != -1) {
            c[len] = (char) temp;
            len ++;
        }
        reader.close();

        String str = new String(c,0,len);
        System.out.println(str);
    }
}
