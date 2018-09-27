package v1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class V2 {
    public static int  SSR(int n,int m){
        int count=0;
        for(int A=1;A<=n;A++){
            for(int B=1;B<=m;B++){
                double sqrt=(sqrt(A)+sqrt(B))*(sqrt(A)+sqrt(B));
                //判断sqrt是否为整数
                int sqrtInt=(int)sqrt;
                //double类型不能比较相等
                double sqrtDouble=sqrtInt;//转double不变
                if (sqrt-sqrtDouble<0.000001||sqrt-sqrtDouble-1>-0.000001){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int count=SSR(n,m);
        System.out.println(count);
    }
}
