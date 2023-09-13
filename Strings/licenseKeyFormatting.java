package Strings;

public class licenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = S.length()-1; i>=0; i--){
            if(S.charAt(i) != '-'){
                sb.append(S.charAt(i));
                count++;
                if(count == K){
                    sb.append('-');
                    count = 0;
                }
            }
        }
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '-'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.reverse().toString().toUpperCase();
    }
}
