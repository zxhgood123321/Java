package jvm.gc;

/**
 * 判断对象是否存货，给对象添加一个引用计数器，每当一个地方引用的时候。计数器甲乙，失效的时候，计数器简易，任何时候计数器为0的对象就是不肯再被使用的  python 游戏脚本
 * 引用计数算法的缺陷
 * objA objB循环引用也被回收了
 * 大多数jvm没有选用
 */
public class ReferenceCountingGC {
    public Object instance=null;
    private static final int _1MB=1024*1024;
    /**
     *这个成员属性的唯一意义就是占点内存一遍能在gc日志中看清楚是否被回收过
     */
    private byte[] bigSize=new byte[2*_1MB];
    public static void testGC(){
        ReferenceCountingGC objA=new ReferenceCountingGC();
        ReferenceCountingGC objB=new ReferenceCountingGC();
        objA.instance=objB;
        objB.instance=objA;
        objA=null;
        objB=null;
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
