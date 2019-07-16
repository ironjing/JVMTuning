package com.yh;

/**
 *
 * @author jingyuanhang
 * @date 2017/10/16
 *
 * 设置运行时：VM Options参数
 * 做逃逸分析       不做在栈上分配   使用本地缓存    打印GC
 * -XX:+DoEscapeAnalysis -XX:+EliminateAllocations -XX:+UseTLAB -XX:+PrintGC
 *
 * 减号代表关闭。关闭逃逸分析   关闭标量替换    关闭线程本地内存   打印GC信息
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -XX:+PrintGC
 *
 */
public class T01 {

    class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    void alloc(int i) {
        new User(i, "name" + i);
    }

    public static void main(String[] args) {
        T01 t01 = new T01();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            t01.alloc(i);
        }
        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);
    }
}
