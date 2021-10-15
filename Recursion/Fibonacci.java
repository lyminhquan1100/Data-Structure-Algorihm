package Recursion;

public class Fibonacci {
    public static void printElement(int[] arr, int index) {
        if (arr[index] == 0)
            return;
        printElement(arr, index - 1);
        System.out.println(arr[index]);
    }




    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printElement(arr,arr.length-1);
//        System.out.println(fibonacci(8));
    }
}
