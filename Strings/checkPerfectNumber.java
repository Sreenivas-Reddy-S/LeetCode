package Strings;

import java.util.ArrayList;
import java.util.List;

public class checkPerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int sum = 1;
        int i = 2;
        while(i*i <= num){
            if(num%i == 0){
                sum += i;
                if(i*i != num){
                    sum += num/i;
                }
            }
            i++;
        }
        return sum == num;
    }
}
