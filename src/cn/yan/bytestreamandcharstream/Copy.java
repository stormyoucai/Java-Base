package cn.yan.bytestreamandcharstream;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/12.
 */
public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2){
            System.out.println("输入的参数不正确");
            System.out.println("例：java copy 源文件路径 目标文件路径");
            System.exit(1); //系统推出
        }

        File file1 = new File(args[0]);
        if (!file1.exists()) {
            System.out.println("源文件不存在");
            System.exit(1);
        }
        File file2 = new File(args[1]);

        InputStream input = new FileInputStream(file1);
        OutputStream output = new FileOutputStream(file2, true);

        //注意：此处采用了边读边写的方式（挺好）
        if (input != null && output != null) {  //判断输入输出是否准备好
            int temp = 0;
            while( (temp = input.read()) != -1 ) {
                output.write(temp);
            }
        }

        input.close();
        output.close();
    }
}
