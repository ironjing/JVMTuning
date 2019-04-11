package com.yh;

/**
 *
 * @author jingyuanhang
 * @date 2017/10/17
 * 可以通过Runtime类大致计算内存情况
 */
public class T03 {
    public static void main(String[] args) {
        printMemoryInfo();
        byte[] b = new byte[1024 *1024];
        System.out.println("---------------------");
        printMemoryInfo();
    }

    private static void printMemoryInfo() {
        System.out.println("total" + Runtime.getRuntime().totalMemory());
        System.out.println("free" + Runtime.getRuntime().freeMemory());
    }
}
