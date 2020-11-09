import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {
    public static void MergeSort(Comparable[] list, Comparator comp, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        MergeSort(list, comp, lo, mid);
        MergeSort(list, comp, (mid + 1), hi);

        Comparable[] buf = Arrays.copyOf(list, list.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = list[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                list[k] = buf[j];
                j++;
            } else if (j > hi) {
                list[k] = buf[i];
                i++;
            } else if (comp.compare(buf[j],buf[i])==-1) {
                list[k] = buf[j];
                j++;
            } else {
                list[k] = buf[i];
                i++;
            }
        }
    }

}
