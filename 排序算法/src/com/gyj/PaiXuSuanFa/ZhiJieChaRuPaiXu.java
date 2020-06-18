package com.gyj.PaiXuSuanFa;

public class ZhiJieChaRuPaiXu {

    public static void main(String[] args) {
        int[] a = {3,2,5,4,6,8,9,7,1};


        //直接插入排序            时间复杂度为(n^2)/4,都是O(n^2)的时间复杂度，但是相较于选择排序和冒泡排序好一些
        //通过定义temp存储需要比较的元素，通过a[j]>temp比较判断，temp需要插入的位置。将比较后在已经完成排序的部分的后半段在插入位置之后的数据
        //同时整体往后移动一位。
        int j ;
        for (int i = 1;i<a.length;i++){
            int temp = a[i];//保存比较的元素。
            for (j = i-1; j>=0 && a[j]>temp ;j--)
                a[j+1] = a[j];//大于temp的元素整体往后移动一位
            a[j+1] =temp;//插入比较的元素。
        }

        //遍历
        for (int value : a) {
            System.out.print(value);
        }
    }
}
