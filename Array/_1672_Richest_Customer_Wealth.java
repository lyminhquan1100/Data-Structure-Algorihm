package Array;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int max1 = 0;
        for (int i = 0; i < accounts.length; i++) { //xuong hang tiep theo
            for (int j = 0; j < accounts[0].length; j++) {
                max1 += accounts[i][j];//tinh tong tung hang
            }
            if (max1 > max) { // so sanh tim gia tri max
                max = max1;
            }
            max1 = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 5}, {7, 3}, {3, 5}, {10, 1}, {10, 2}};
        System.out.println(maximumWealth(a));

//        int soDong = a.length; //so hang=2
//        int soCot = a[0].length;// so cot = 3
//        for (int i = 0; i < soDong; i++) {
//            for (int j = 0; j < soCot; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
