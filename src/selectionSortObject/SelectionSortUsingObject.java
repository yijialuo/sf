package selectionSortObject;


import tool.Array;

public class SelectionSortUsingObject {
    //数组前n项排序
    public static void selectionSort(Student[] arry, int n) {
        if (n > arry.length)
            n = arry.length;
        for (int i = 0; i < n; i++) {
            //最小的位置
            int minIndex = i;
            //找后面的最小值
            for (int j = i + 1; j < n; j++) {
                if (arry[minIndex].compareTo(arry[j])>0)
                    minIndex = j;
            }
            //交换
            Student a = arry[i];
            arry[i] = arry[minIndex];
            arry[minIndex] = a;
        }
    }

    public static void main(String[] args) {
        // 测试模板函数，传入自定义结构体Student数组
        Student[] d = new Student[4];
        d[0]=new Student("D",90);
        d[1]=new Student("C",100);
        d[2]=new Student("B",95);
        d[3]=new Student("A",95);
        selectionSort(d,4);
        System.out.println(Array.print(d));
    }
}
