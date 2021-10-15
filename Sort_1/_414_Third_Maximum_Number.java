package Sort_1;

public class _414_Third_Maximum_Number {
    public static void insert(int[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (val == maxArr[i]) {
                //khong duoc trung
                return;
            } else if (val > maxArr[i]) {
                //chen val vao maxArr[i]
                break;
            } else { //val<maxArr[i]
                i++;
            }
        }
        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static int thirdMax(int[] a) {
        int[] maxArr = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < a.length; i++) {
            insert(maxArr, a[i]);
        }

        if (maxArr[2] == Integer.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    public static void main(String[] args) {
        int[] a = {4, 4, Integer.MIN_VALUE, 1};
        System.out.println(thirdMax(a));
    }
}
