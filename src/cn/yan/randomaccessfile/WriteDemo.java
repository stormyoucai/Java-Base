package cn.yan.randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by yanchongsheng on 2017/12/11.
 */

/**
 * 注意每条数据的长度都是12位
 * byte字节：1字节=8位
 */
public class WriteDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator +"test.txt");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");    //rw文件不存在会自动创建

        randomAccessFile.writeBytes("zhangsan");
        randomAccessFile.writeInt(20);

        randomAccessFile.writeBytes("lisi    ");//注意都是8位，不够的拿空格补齐
        randomAccessFile.writeInt(30);

        randomAccessFile.writeBytes("wangwu  ");
        randomAccessFile.writeInt(40);

        randomAccessFile.close();
    }
}
