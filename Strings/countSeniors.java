package Strings;

public class countSeniors {
    public static void main(String[] args) {
        String[] details ={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }

    public static int countSeniors(String[] details){
        int result = 0;
        for(String detail: details){
            System.out.println(detail.charAt(11));
            if(detail.charAt(11) > 6) result++;
        }
        return result;
    }
}
