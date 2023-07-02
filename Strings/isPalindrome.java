package Strings;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
//        System.out.println(s);
        while(left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


//    String current = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
//    String rev = new StringBuffer(current).reverse().toString();
//        return current.equals(rev);