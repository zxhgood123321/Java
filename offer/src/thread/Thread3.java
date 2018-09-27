package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

//带返回值的线程实现方式
/*1.创建一个类实现Callable接口，实现call方法，这个接口类似于Runnable接口，但比Runnable接口
    更加强大，实现了异常和返回值
  2.创建一个FutureTask，指定Callable对象，做为线程任务
  3.创建线程，指定线程任务
  4.启动线程
*/
public class Thread3 {
    public static void main(String[] args)throws Exception {
        Callable<Object> oneCallable=new Tickets<>();
        FutureTask<Object> oneTask=new FutureTask<Object>(oneCallable);
            Thread t=new Thread(oneTask);
            System.out.println(Thread.currentThread().getName());
            t.start();

    }
}
class Tickets<Object> implements Callable<Object>{

    @Override
    public Object call() throws Exception {
        int i=50;
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现Callable接口通过FutureTask包装器来实现的线程");
        return null;
    }
}
