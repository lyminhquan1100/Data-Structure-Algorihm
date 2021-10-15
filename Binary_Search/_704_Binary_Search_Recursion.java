package Binary_Search;

public class _704_Binary_Search_Recursion {
    public static int binarySearch(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]) {
            return iMid;
        } else if (key > a[iMid]) {
            return binarySearch(a, key, iMid + 1, iRight);
        } else {
            return binarySearch(a, key, iLeft, iMid - 1);
        }
    }

    public static int binarySearch(int[] a, int key) {
        int n = a.length;
        return binarySearch(a, key, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 9, 12, 19, 25, 31, 46, 50, 67, 88, 90};
        System.out.println(binarySearch(a, 88));
    }
}
