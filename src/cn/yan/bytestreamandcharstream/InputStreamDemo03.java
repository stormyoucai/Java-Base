package cn.yan.bytestreamandcharstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by yanchongsheng on 2017/12/11.
 */
public class InputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        File file = new File("E:" + File.separator + "test.txt");
        InputStream in = new FileInputStream(file);

        byte[] b = new byte[1024];
        int len = 0;
        int temp = 0;
        while ( (temp = in.read()) != -1) {
            b[len] = (byte) temp;
            len ++;
        }
        in.close();

        System.out.println(new String(b));
    }
}
