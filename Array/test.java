package Array;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("nhap num: ");
        int a = Integer.parseInt(scan.nextLine());
        int b = reverse(a);
        System.out.println(b);
    }

    public static int reverse(int n) {

       int reNum = n % 10; // B1: Lấy chữ số cuối cùng
        n /= 10; // Bỏ chữ số cuối cùng
        int last;
        while(n > 0){
            last = n % 10; // Lấy chữ số cuối cùng
            n /= 10; // Bỏ chữ số cuối cùng
            reNum = reNum * 10 + last; // Chính là các bước 2 3 4
        }
        return reNum;
    }
}
