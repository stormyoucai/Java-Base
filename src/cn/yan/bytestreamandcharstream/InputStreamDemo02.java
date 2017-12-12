package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/11.
 */

//适用于知道文件大小的情况
public class InputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        File file = new File("E:" + File.separator + "test.txt");
        InputStream in = new FileInputStream(file);
        byte[] b = new byte[(int) file.length()];

        for (int i = 0; i < b.length; i ++) {
            b[i] = (byte) in.read();
        }

        /*//TODO 这段代码为什么不好使？ 答：foreach中，每个元素都是只读的，不能进行赋值操作
        for (byte each : b) {
            each = (byte) in.read();
        }*/

        in.close();

        System.out.println(new String(b));
    }
}
