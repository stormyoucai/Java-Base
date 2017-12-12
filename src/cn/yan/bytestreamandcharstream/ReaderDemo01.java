package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/12.
 */
public class ReaderDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        Reader reader = new FileReader(file);

        char[] c = new char[1024];
        int len = reader.read(c);
        reader.close();

        String str = new String(c,0,len);   //注意这块，去char数组的一部分进行输出
        System.out.println(c);

    }
}
