package cn.yan.file;

import java.io.File;

/**
 * Created by yanchongsheng on 2017/12/11.
 */
public class FilePractices {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator);
        printFile(file);
    }

    private static void printFile(File file) {
        if (file == null) {
            throw new NullPointerException("file不能为null");
        }
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            if (fileList != null) {
                for (File fileEach:fileList) {
                    printFile(fileEach);
                }
            }
        } else {
            System.out.println(file);
        }
    }
}
