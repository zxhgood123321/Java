package baidu;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int sum = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += Math.abs(a[i] - a[Math.max(i - 1, 0)]);//求出所有路径中走的距离；
            }
            int diff = 0;
            for (int i = 1; i < n - 1; i++) {
                int d = Math.abs(a[i] - a[i - 1]) + Math.abs(a[i] - a[i + 1]) - Math.abs(a[i - 1] - a[i + 1]);
                diff = Math.max(diff, d);   //找出路径中省略掉一个点的最大多行走距离；
            }
            System.out.println(sum - diff);   //输出省略掉一个点后的最少行走距离；
        }
    }
}
