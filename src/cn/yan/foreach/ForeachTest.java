package cn.yan.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ForeachTest {
    private static int[] array = { 1, 2, 3 };
    private static int[][] arrayTwo = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    private static List<String> list = new ArrayList<String>();

    static {
        list.add("array - 1");
        list.add("array - 2");
        list.add("array - 3");
    }

    public static void main(String[] args) {
        oldWrite();
        newWrite();
        foreachTwo();
        forList();
        iteratorList();
        foreachList();
    }

    /**
     * 旧形式的遍历
     */
    private static void oldWrite() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 新形式的遍历
     */
    private static void newWrite() {
        for (int i : array) {
            // foreach实现原理一：实际上本方法去遍历数组的时候使用的是for一样的方式去循环遍历数组
            System.out.println(i);
        }
    }

    /**
     * 新形式对于二维的遍历
     */
    private static void foreachTwo() {
        for (int[] i : arrayTwo) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }

    /**
     * 旧方式遍历集合
     */
    private static void forList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    /**
     * 使用迭代器遍历集合
     */
    private static void iteratorList() {
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            System.out.println((String) iterator.next());
        }
    }

    /**
     * 使用新形式遍历集合
     */
    private static void foreachList() {
        for (String string : list) {
            // foreach实现原理二：实际上本方法遍历容器使用的方式是通过迭代器来进行的
            System.out.println(string);
        }
    }

}