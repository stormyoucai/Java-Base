package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/11.
 */

/**
 * 问题1：数据开辟的过大
 * 问题2：转换为String的时候后面有n多空格
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        InputStream in = new FileInputStream(file);

        byte[] b = new byte[(int) file.length()];
        int len = in.read(b);   // len读入数据的长度
        in.close();

        System.out.println(new String(b,0,len));
    }
}
