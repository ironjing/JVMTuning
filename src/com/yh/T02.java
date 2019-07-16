package com.yh;

/**
 *
 * @author jingyuanhang
 * @date 2017/10/17
 *
 * 详细分析各内存新生代、老年代占比
 *
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:+PrintGCDetails   -XX:-UseTLAB
 * 关闭逃逸分析   关闭标量替换                          打印GC内存详细信息   不使用线程本地缓存
 *
 *
 */
public class T02 {
    public static void main(String[] args) {
        byte[] b = new byte[1024];
    }
}
