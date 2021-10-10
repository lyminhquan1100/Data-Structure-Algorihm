package Array;

public class test2 {
    public static void main(String[] args) {
        int scores[] = {100, 100, 50, 40, 20, 10};
        int rank[] = new int[scores.length];

        int player[] = {5, 25, 50, 120};
        int rank2[] = new int[player.length];

        rank[0] = 1;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i - 1]) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < player.length; i++) {
            if (player[i] > scores[0]) {
                rank2[i] = 1;
            } else if (player[i] < scores[scores.length - 1]) {
                rank2[i] = rank[scores.length - 1] + 1;
            } else {
                int index = binarySearch(scores, player[i]);
                rank2[i] = rank[index];
            }
        }

        for (int pt : rank2) {
            System.out.print(pt + " ");
        }
    }

    private static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
