package baidu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BuyHat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        //初始化帽子数组
        int hat[]=new int[n];
        for (int i=0;i<hat.length;i++){
            hat[i]=input.nextInt();
        }
        //排序后帽子的数组
        ArrayList three =sort(hat);
        if(three.size()>=3){
            System.out.println(three.get(2));
        }
        else {
            System.out.println(-1);
        }
    }
    //冒泡排序
    public static ArrayList sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        //去除重复元素
        ArrayList brr=new ArrayList();
        brr.add(arr[0]);
        for (int i=0;i<arr.length-1;i++) {
                if (arr[i] != arr[i+1]) {
                    brr.add( arr[i+1]);
                }
        }
        
        return brr;
    }
}
