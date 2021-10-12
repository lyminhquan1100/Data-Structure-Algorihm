package Array;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1,3,nums2,3);
        for(int pt: nums1){
            System.out.print(pt + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int ai, int[] nums1, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            if (nums1[k] > ai) {
                timDuocK = true;
                for (int i = m - 1; i >= k; i--) {
                    nums1[i + 1] = nums1[i];
                }
                nums1[k] = ai;
                break;
            }
        }

        if (timDuocK == false) {
            nums1[m] = ai;
        }
    }

}
