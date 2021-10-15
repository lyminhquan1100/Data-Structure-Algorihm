package Sort_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _912_Sort_an_Array {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = {1, 5, 3, 2, 8, 7, 6, 4};
        System.out.println(Arrays.toString(mergeSort(c,0,c.length-1)));
    }

    public static int[] merge(int a1[], int a2[]) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int[] mergeSort(int a[], int L, int R) {
        if (L > R) {
            return new int[0];
        }
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }

        // Chia ra
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);

        // Tron vao: a2 va a1 la cac mang da duoc sap xep
        int[] result = merge(a1, a2);
        return result;
    }
}
