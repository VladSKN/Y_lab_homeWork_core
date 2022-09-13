package y_LabHomeWork.sortArray;


import java.util.Arrays;

/**
 * В своей реализации сортировки я выбрал mergeSort
 * сортировка слиянием — алгоритм «разделяй и властвуй»
 * Временная сложность данного алгоритма O(nLogn).
 */


public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        System.out.println(Arrays.toString(mergeSort(array, array.length)));
    }


    public static int[] mergeSort(int[] array, int n) {
        if (n < 2) {
            return array;
        }

        if (array == null) {
            return new int[0];
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(array, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(array, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
        return array;
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
