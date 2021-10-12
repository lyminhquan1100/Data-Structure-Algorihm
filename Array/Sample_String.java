package Array;

public class Sample_String {

    public static void main(String[] args) {
        String s1 = "Hello Word 1 2 3 9";
        String s2 = new String("Hello World");
        for (int i = 0; i < s1.length(); i++) { // Java co the hieu dc bang ma ASCII
            char c = s1.charAt(i);
            if (c >= '0' && c <= '9') {
                System.out.print(c + " ");
            }
        }
//
//        for (int i = 0; i < s1.length(); i++) {
//            char c = s1.charAt(i);
//            if (Character.isUpperCase(c)) {
//                System.out.print(c + " ");
//            }
//            if (Character.isDigit(c)) {
//                System.out.print(c + " ");
//            }
//
//
//            char a = 'A';
//            System.out.println(a + "Co ma ASCII la: " + (int) c);
////            System.out.println(s1.charAt(i));//truy cap tung phan tu trong mang
//        }
    }
}
