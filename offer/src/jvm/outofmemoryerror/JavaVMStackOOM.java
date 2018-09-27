package jvm.outofmemoryerror;

/**
 * 减少最大堆和减少栈容量来正价最大线程数
 * java线程是映射到操作系统内核线程上的，可能导致操作系统假死
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom=new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
