package com.gyj.PaiXuSuanFa;

public class MaoPao {

    public static void main(String[] args) {



        /*
        //冒泡排序 时间复杂度为 O(n^2)
        //int[] a = {9,7,5,3,2,4,1,6,8};

        for (int i = 0;i<a.length;i++){
            for (int j = a.length-1;j>i;j--){
                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
*/

        //冒泡排序 改进（若输入数组中本来就有排序好的序列，）
        int[] a = {2,1,3,4,5,6,7,8,9};
        boolean flag = true;
        for (int i = 0;i<a.length && flag;i++){ //flag = false时跳出循环，也即是，前面的排序好后，后面的序列没有交换，则说明后面部分的序列也是排好序的，则跳出循环。
            flag = false;
            for (int j = a.length-1;j>i;j--){
                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    flag = true;
                }
            }
        }

        //遍历
        for (int value : a) {
            System.out.print(value + " ");
        }

    }
}
