package thread;

public class Thread2 implements Runnable {
    @Override
    public void run() {
      int i=50;
      while(true){
          if(i<=0)
          System.out.println(Thread.currentThread().getName()+"  "+i--);
      }
    }
    public static void main(String[] args) {
        Thread2 m1=new Thread2();
        Thread mm1=new Thread(m1);
        Thread mm2=new Thread(m1);
        mm1.start();
        mm2.start();
    }
}
