package thread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<100){
        System.out.println(i++);
    }
    }

    public static void main(String[] args) {
        Thread1 m1=new Thread1();
        Thread1 m2=new Thread1();
        m1.start();
        m2.start();
    }
}
