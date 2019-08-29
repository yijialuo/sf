package tool;

public class Array {
    public static<T> StringBuffer print(T[] arry) {
        if (arry == null || arry.length == 0)
            return null;
        StringBuffer res = new StringBuffer(arry[0] + "");
        for (int i = 1; i < arry.length; i++) {
            res.append(" " + arry[i]);
        }
        return res;
    }
}
