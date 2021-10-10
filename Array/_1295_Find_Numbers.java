package Array;

public class _1295_Find_Numbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for ( int a: nums){
            int soluongChuSo = tinhSoChuSo(a);
            if(soluongChuSo %2 ==0) {
                count++;
            }
        }
        return count;
    }

    private static int tinhSoChuSo(int a) {
        int count =0;
        int kq =a;
        while (kq != 0) {
            kq=a/10;
            a=kq;
            count++;
        }
        return count;
    }

}
