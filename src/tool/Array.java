package tool;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Random;

public class Array {
    //打印数组的前n个
    public static void print(int[] arry, int n) {
        if (n > arry.length)
            n = arry.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arry[i] + " ");
        }
        System.out.println();
    }

    //产生【rangL,rangR】的随机数数组
    public static int[] generateRandomArray(int n, int rangL, int rangR) {
        int[] res = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            res[i] = random.nextInt(rangR - rangL + 1) + rangL;
        }
        return res;
    }

    //判断数组的前n个，是否已经排序
    public static boolean isSort(int[] arry, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arry[i] > arry[i + 1])
                return false;
        }
        return true;
    }

    //测试方法
    public static void testSort(String sortName, Method method, int[] arr, int n) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        long startTime = new Date().getTime();
        method.invoke(method.getDeclaringClass().newInstance(), arr, n);
        assert (isSort(arr, n));
        long endTime = new Date().getTime();
        System.out.println(sortName + ": " + (endTime - startTime) + "ms");
    }

    //拷贝数组
    public static int[] copyArray(int[] arry){
        int[] res=new int[arry.length];
        for(int i=0;i<arry.length;i++){
            res[i]=arry[i];
        }
        return res;
    }
}
