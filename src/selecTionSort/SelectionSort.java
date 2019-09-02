package selecTionSort;

import tool.Array;

import java.lang.reflect.InvocationTargetException;

public class SelectionSort {
    //选择排序，每次找到数组后面的最小值，
    public  void selectionSort(int[] arry, int n) {
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

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        int[] a = Array.generateRandomArray(100000, 10, 5555);
        Array.testSort("selecTionSort", SelectionSort.class.getDeclaredMethod("selecTionSort",int[].class,int.class),a,100000);
        Array.print(a,100000);
    }
}
