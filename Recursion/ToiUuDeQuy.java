package Recursion;

public class ToiUuDeQuy {
    public static void main(String[] args) {
        int[] Fibo = new int[11];
        Fibo[1] =1;
        Fibo[2]=2;
        for (int i = 3; i <11 ; i++) {
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }
        System.out.println(F[10]);
    }
    static int[] F = new int[1000];
    public static int Fibo(int n){
        if(F[n] !=0){
            return F[n];
        }
        if(n<=2){
            F[1] =1;
            F[2] =2;
            return 1;
        }

        F[n] = Fibo(n-1)+Fibo(n-2);
        return F[n];
    }
}
