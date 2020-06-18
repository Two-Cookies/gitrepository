package com.gyj.PaiXuSuanFa;

public class XuanZePaiXu {

    public static void main(String[] args) {

        int[] a = {9,6,5,7,8,4,2,1,3};

        //选择排序，通过给定一个min来保存每次对比的最小值的下标，然后只交换每次循环对比中的最小值到最前；对比次数为的时间复杂度为n^2,而交换次数为n-1.
        //相比于冒泡排序好一些。
        int min ,j;

        for (int i = 0;i<a.length;i++){
            min = i;

            for (j = i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }

            if (i != min ){
                int temp = a[min];
                a[min] =a[i];
                a[i] = temp;
            }

        }

        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
