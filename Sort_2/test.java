package Sort_2;


import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] c = {1, 5, 3, 2, 8, 7, 6, 4};
        System.out.println(Arrays.toString(sortArray(c)));
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int[] mergeSort(int[] nums, int L, int R) {
        if (L > R) {
            return new int[0];
        }
        if (L == R) {
            int[] singleElement = {nums[R]};
            return singleElement;
        }

        int mid = (L + R) / 2;
        int[] nums1 = mergeSort(nums, L, mid);
        int[] nums2 = mergeSort(nums, mid + 1, R);
        int result[] = merge(nums1, nums2);
        return result;
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int result[] = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < nums1.length && i2 < nums2.length) {
                if (nums1[i1] < nums2[i2]) {
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            } else {
                if(i1<nums1.length){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }
}
