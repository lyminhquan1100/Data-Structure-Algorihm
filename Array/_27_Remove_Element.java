package Array;

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[k] = nums[i];
//                k++;
//            }
//            return k;
//        }
//        int n = a.length;
//        for (int i = 0; i < n; ) {
//            if (a[i] == val) {
//                //xoa phan tu nums[i]
//                for (int j = i; j <= (n - 2); j++) {
//                    a[j] = a[j + 1];
//                }
//                n--;
//            } else {
//                i++;
//            }
//        }



    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
        System.out.println("Done");
    }
}
