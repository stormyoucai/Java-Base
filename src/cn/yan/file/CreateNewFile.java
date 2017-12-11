package cn.yan.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by yanchongsheng on 2017/12/11.
 */
public class CreateNewFile {
    public static void main (String[] args) throws IOException {
        /*System.out.println(File.pathSeparator);
        System.out.println(File.separator);*/

        /*File file = new File("E:" + File.separator + "test");*/

        /*//创建一个新文件
        file.createNewFile();*/

        /*//删除一个指定的文件
        file.delete();*/

        /*//综合创建、删除
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }*/

        /*//创建文件夹
        file.mkdir();*/

        File newFile = new File("E:" + File.separator);

        /*String[] strList = newFile.list();
        for(String strEach:strList) {
            System.out.println(strEach);
        }*/

        /*File[] fileList = newFile.listFiles();
        for (File fileEach:fileList){
            System.out.println(fileEach);
        }*/

        /*boolean isDirectory = newFile.isDirectory();
        if (isDirectory){
            System.out.println("是目录");
        }else {
            System.out.println("不是目录");
        }*/

        /*file.renameTo(new File("E:" + File.separator + "hhhh"));*/
    }
}
