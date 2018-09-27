package v1;

import java.util.Scanner;
public class V4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //首先 建立一个数组存储所有 1-100000 的平方
        int num[] = new int[100000];
        for(int i = 0; i < 100000; i++) {
            num[i] = (i+1) * (i+1);
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 建立一个数组 存储有哪个数还没有被遍历 0:没遍历 1:遍历了
        int numn[] = new int[n+1];
        int count = 0;//计数
        if(n > m) {//永远认为n小一点 大就交换
            int temp = n;
            n = m;
            m = temp;
        }
        for(int i = 1; i <= n; i++) {//建立一个循环 条件n,m都可以 最好是小的那个 因为速度会快一点
            if(numn[i] == 1) continue; //1 直接跳过
            int index = 0; //用来标记num数组
            int sum1 = 0,sum2 = 0;
            while(i * num[index++] <= m){
                sum1 ++;
            }
            index = 0;
            while(i * num[index] <= n){
                numn[i * num[index]] = 1;
                sum2++;
                index++;
            }
            count += sum1 * sum2;
        }
        System.out.println(count);
    }
}