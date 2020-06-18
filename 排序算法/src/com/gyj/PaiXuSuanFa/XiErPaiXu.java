package com.gyj.PaiXuSuanFa;

public class XiErPaiXu {

    public static void main(String[] args) {
        int[] a = {3,2,5,4,6,8,9,7,1};

        /*
            希尔排序    (像是步长逐渐递减的直接插入排序，直接插入排序的步长为1，而希尔排序的步长从刚开始自定义的步长，每次缩小自定义的倍数，最终步长为1。完成排序)
         */
        int j;
        for (int mid = a.length/2; mid > 0;mid /=2){    //计算每次的增量值（步长）

            for (int i = mid;i<a.length;i++){ //从第一个步长开始 循环插入
                int temp = a[i];    //定义一个temp存储当前要比较的数据
                for (j = i;j>=mid && a[j-mid]>temp;j -= mid ) //从后往前，比较每个步长的前后大小，并一直比较到下标在第一个步长以内的元素或者前面的元素都小于时。
                    a[j] = a[j-mid];
                a[j] = temp;    //此时的j为步长比较完成后，最前面的元素，同时将temp 赋值给它。
            }
        }

        //遍历
        for (int value : a)
            System.out.print(value + " ");
    }
}
