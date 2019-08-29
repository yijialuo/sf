package selectionSort;

import tool.Array;

public class SelectionSort {
    //数组前n项排序
    public static void selectionSort(int[] arry, int n) {
        if (n > arry.length)
            n = arry.length;
        for (int i = 0; i < n; i++) {
            //最小的位置
            int minIndex = i;
            //找后面的最小值
            for (int j = i + 1; j < n; j++) {
                if (arry[minIndex] > arry[j])
                    minIndex = j;
            }
            //交换
            int a = arry[i];
            arry[i] = arry[minIndex];
            arry[minIndex] = a;
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(a, 11);
       // System.out.println(Array.print(a));
    }
}
