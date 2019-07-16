package com.yh;

/**
 * @author jingyuanhang
 * @date 2017/10/17
 *
 * 线程栈  会被耗尽
 * 栈异常   StackOverFlow
 *
 * 线程栈大小
 * -Xss100k   栈的大小调整
 */
public class T05 {
    static int count = 0;

    static void r() {
        count++;
        r();
    }

    public static void main(String[] args) {
        try {
            r();
        } catch (Throwable w) {
            System.out.println(count);
            w.printStackTrace();
        }
    }
}
