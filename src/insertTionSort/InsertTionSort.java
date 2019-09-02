package insertTionSort;

import selecTionSort.SelectionSort;
import tool.Array;

import java.lang.reflect.InvocationTargetException;

public class InsertTionSort {

    //插入排序，找到数组的合适位置
    public static void insertTionSort(int[] arry,int n){
        if(n>arry.length)
            n=arry.length;
        for(int i=0;i<n;i++){
//            for(int j=i;j>0;j--){
//                if(arry[j]<arry[j-1]){
//                    //交换
//                    int a=arry[j];arry[j]=arry[j-1];arry[j-1]=a;
//                }else{
//                    break;
//                }
//            }
//            for( int j = i ; j > 0 && arry[j] < arry[j-1] ; j -- ) {
//                int a = arry[j];
//                arry[j] = arry[j - 1];
//                arry[j - 1] = a;
//            }
            int e=arry[i];
            int j=i;
            for(;j>0&&arry[j-1]>e;j--)
                arry[j]=arry[j-1];
            arry[j]=e;
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        int[] a1= Array.generateRandomArray(1000000,10,100000);
        int[] a2=Array.copyArray(a1);
        Array.testSort("selecTionSort", SelectionSort.class.getDeclaredMethod("selectionSort", int[].class, int.class),a2,1000000);
        Array.testSort("insertTionSort",InsertTionSort.class.getDeclaredMethod("insertTionSort", int[].class, int.class),a1,1000000);
    }
}
