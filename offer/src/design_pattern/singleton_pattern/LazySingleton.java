package design_pattern.singleton_pattern;

/**
 * 懒汉式，线程不安全
 * 是否Lazy初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class LazySingleton {
    //初始化单例对象
    private static LazySingleton singleton=new LazySingleton();
    //设置私有的构造方法
    private LazySingleton(){

    }
    //返回单例对象
    public LazySingleton getInstance(){
        //如果对象不存在，创建对象
        if (singleton==null)
        {   //访问本类的私有构造方法
            singleton=new LazySingleton();
        }
        //存在返回单例对象
        return singleton;
    }

}
