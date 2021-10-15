package Sort_1;

public class Insertion_Sort {
    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i-1;
            while (j >=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 2, 7, 8, 1, 9};
        insertionSort(a);
        for (int pt : a) {
            System.out.print(pt + " ");
        }
    }
}
