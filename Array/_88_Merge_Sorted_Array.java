package Array;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        
    }

    public static boolean merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < m; i++) {
            if(nums1[i] < nums2[i]){
                continue;
            } else if(nums1[i] == nums2[i]){
                nums1[i+1] = nums2[i];
            } else {
                nums1[i] = nums2[i];
            }
        }
        return false;
    }
}
