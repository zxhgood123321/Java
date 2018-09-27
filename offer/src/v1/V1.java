package v1;

import java.util.Scanner;
//https://www.nowcoder.com/question/next?pid=8246651&qid=137974&tid=13890509
public class V1 {
    public static String repeat(String x,String k){
        int kInt=Integer.parseInt(k);
        String v=x;
        for (int i=1;i<kInt;i++){
            v=v+x;
        }
        return v;
    }
    //判断x为几位数
//    public static int Mu(long x){
//        int count=1;
//        while (x>1){
//            x=x/10;
//            count++;
//        }
//        return count;
//    }
//      public static long repeat(long x,long k){
//          long v=x;
//        //判断x为几位数;添上几个0不是乘以几
//          int count=Mu(x);
//          for (int j=0;j<k-1;j++) {
//              for (int i = 0; i < count; i++) {
//                  v = v * 10;
//              }
//              v=v+x;
//          }
//          return v;
//    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x1=input.next();
        String k1=input.next();
        String x2=input.next();
        String k2=input.next();
        String v1=repeat(x1,k1);
        String v2=repeat(x2,k2);
   /*     //一定要去空格
        v1=v1.trim();
        v2=v2.trim();
        int v1Int=Integer.parseInt(v1);
        int v2Int=Integer.parseInt(v2);*/
//      System.out.println(v1.compareTo(v2));
        if (v1.length()<v2.length()){
            System.out.println("Less");
        }
        else if (v1.length()==v2.length()){
            if (v1.compareTo(v2)<0){
                System.out.println("Less");
            }
            else if(v1.compareTo(v2)==0){
                System.out.println("Equal");
            }
            else{
                System.out.println("Greater");
            }
        }
        else {
            System.out.println("Greater");
        }

//        Scanner input=new Scanner(System.in);
//        long x1=input.nextInt();
//        long k1=input.nextInt();
//        long x2=input.nextInt();
//        long k2=input.nextInt();
//        long v1=repeat(x1,k1);
//        long v2=repeat(x2,k2);
//        if (v1<v2){
//            System.out.println("Less");
//        }
//        else if(v1==v2){
//            System.out.println("Equal");
//        }
//        else
//            System.out.println("Greater");
    }
}
