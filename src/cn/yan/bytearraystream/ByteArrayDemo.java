package cn.yan.bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by yanchongsheng on 2017/12/14.
 */
public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        String str = "HELLO WORLD";
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());//输入到内存中了
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int temp = 0;
        while( (temp = bis.read()) != -1 ) {    //从内存中一个个的读出来
            char c = (char) temp;
            bos.write(Character.toLowerCase(c));    //所有的数据都放在输出流里面了
        }

        //现在所有的数据都在ByteArrayOutputStrem中了
        String newStr = bos.toString();
        bos.close();
        bis.close();


        System.out.println(newStr);
    }
}
