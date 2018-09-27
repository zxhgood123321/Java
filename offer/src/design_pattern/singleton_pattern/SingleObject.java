package design_pattern.singleton_pattern;

/**
 * 单例模式
 */

/**
 * 意图:保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * 主要解决：一个全局使用的类频繁地创建与销毁
 * 何时使用：当您想控制实例数目，节省系统资源的时候
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建
 * 关键代码：构造函数是私有的
 * 应用实例：windows是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同事操作一个文件的现象，所以所有文件的处理必须通过唯一的实例
 * 使用场景：1.要求生产唯一的序列号2.web中的计数器，不用每次刷新都加一次，先用单例缓存起来，3.创建的一个对象需要消耗的资源过多,如i/o与数据库的连接
 * 优点：1.在内存里只有一个实例，减小了内存的开销，尤其是频繁地创建和销毁实例（比如管理学院页面缓存）2.避免对资源的多重占用（比如写文件操作）
 * 缺点：没有接口，不能继承，与单一职责原则冲突，一个；类应该只关心内部逻辑，而不关心外面怎么样来实例化
 *注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化。
 *
 */
//创建一个singleton类
public class SingleObject
{
    //创建SingleObject的一个对象
    private static SingleObject instance=new SingleObject();
    //让构造函数为private，这样该类就不会被实例化
    private SingleObject(){

    }
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void  showMessage(){
        System.out.println("Hello World!");
    }
}

