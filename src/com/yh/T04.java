package com.yh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jingyuanhang
 * @date 2017/10/17
 * 内存溢出
 *-XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:\tmp\jvm.dump -XX:+PrintGCDetails -Xms10M -Xmx10M
 */
public class T04 {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            list.add(new byte[1024 * 1024]);
        }
    }
}
