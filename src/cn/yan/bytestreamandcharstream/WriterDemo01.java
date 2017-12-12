package cn.yan.bytestreamandcharstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by yanchongsheng on 2017/12/12.
 */

/**
 * 注意：程序执行完成以后，打开txt文件，查看光标所在位置，在最左边，可以看出是覆盖式的向文件中写入内容
 * 字符流默认情况下是覆盖已有的文件，要想追加，增加一个追加标记
 * 注意：本demo中同时建立了两个Writer类，writerOverride如果文件已经存在则直接覆盖，writerAppend如果文件存在，则不会覆盖
 * 相当于给test.txt文件设置一个属性：但是writerOverride的优先级更高，如果它存在，则writerAppend不会起作用
 */
public class WriterDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "test.txt");
        Writer writerAppend = new FileWriter(file,true);    //追加式
        Writer writerOverride = new FileWriter(file);   //覆盖式


        String str = "我：你好啊 ";
        writerAppend.write(str);
        writerAppend.close();
    }
}
