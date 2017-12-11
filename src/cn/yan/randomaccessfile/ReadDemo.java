package cn.yan.randomaccessfile;

/**
 * Created by yanchongsheng on 2017/12/11.
 */

import java.io.File;
import java.io.RandomAccessFile;

/**
 * 注意写的时候可以将一个字符串写入，但读的时候需要一个个的以字节的形式读取出来
 * byte字节：1byte=8位
 * 注意点：始终要明确当前指针的位置
 */
public class ReadDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("E:" + File.separator + "test.txt");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"r");

        /*byte[] buff = new byte[24];
        randomAccessFile.read(buff);
        for (int i =0;i<buff.length; i++) {
            System.out.println(buff[i]);
        }*/

        String name = null;
        int age = 0;

        byte[] b = new byte[8];

        //读取第二个人的信息
        randomAccessFile.skipBytes(12);
        for (int i = 0; i < b.length; i ++) {
            b[i] = randomAccessFile.readByte();
        }
        name = new String(b);
        age = randomAccessFile.readInt();
        System.out.println(name + age);

        //读取第一个人的信息
        randomAccessFile.seek(0);
        for (int i = 0; i < b.length; i ++) {
            b[i] = randomAccessFile.readByte();
        }
        name = new String(b);
        age = randomAccessFile.readInt();
        System.out.println(name + age);

        //读取第三个人的信息
        randomAccessFile.skipBytes(12);
        for (int i = 0; i < b.length; i ++) {
            b[i] = randomAccessFile.readByte();
        }
        name = new String(b);
        age = randomAccessFile.readInt();
        System.out.println(name + age);

        randomAccessFile.close();
    }
}
