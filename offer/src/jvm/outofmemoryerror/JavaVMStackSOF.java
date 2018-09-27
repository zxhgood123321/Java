package jvm.outofmemoryerror;

/**
 * 虚拟机栈和本地方法栈溢出
 * 单线程 无论栈帧太大，还是虚拟机栈的容量太小都抛出stackoverflowError
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;//增加深度
        stackLeak();
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }
    }
}
