package Sort_1;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 7, 8, 1, 9};
        insertionSort(a);
        for (int pt : a) {
            System.out.print(pt + " ");
        }
    }

    private static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }

//        for (int i = 0; i < a.length; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < a.length; j++) {
//                if(a[j]<a[minIndex]){
//                    minIndex=j;
//                }
//            }
//            if(minIndex !=i){
//                int temp = a[i];
//                a[i]=a[minIndex];
//                a[minIndex]=temp;
//            }
//        }
    }

}
