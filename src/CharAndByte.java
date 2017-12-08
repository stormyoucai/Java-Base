/**
 * Created by yanchongsheng on 2017/12/8.
 */

/**
 * 区分char和byte
 * char可以表示中文，byte不可以
 */
public class CharAndByte {
    public static void main(String[] args) {
        char c1 = '中';
        byte b1 = (byte) '中';
        System.out.println(c1);
        System.out.println(b1);
    }
}
