package com.yh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jingyuanhang
 * @date 2017/10/17
 *
 * 通过visualVM来分析内存
 *
 * 内存溢出后就倾倒                   倾倒到某个文件下                 打印内存详细信息    起始内存  最大内存
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
