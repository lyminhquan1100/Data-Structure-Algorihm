package Array;

public class _387_FirstUniqueCharacter_in_a_String {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i];
                count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i];
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.print(firstUniqChar(s));
    }
}
