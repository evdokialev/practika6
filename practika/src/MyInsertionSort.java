import java.util.Comparator;

public class MyInsertionSort {
    public static void InsertionSort(Comparable[] list, Comparator comp)
    {
        for (int i = 0; i < list.length;i++){
            Comparable temp = list[i];
            int q = i - 1;
            for (; q >= 0; q--) {
                if ((comp.compare(list[q], temp)==-1)) {
                    list[q+1]=list [q];
                } else break;
            }
            list[q+1] = temp;
        }
    }
}