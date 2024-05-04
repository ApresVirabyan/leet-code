public class PalindromeNumber9 {

    public static void main(String[] args) {

    }

    static boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[chars.length - 1 -i]){
                return false;
            }
        }

        return true;
    }

    static boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    static boolean isPalindrome3(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reversed = 0;
        while( x > reversed) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        return x == reversed || x == reversed / 10;
    }
}
