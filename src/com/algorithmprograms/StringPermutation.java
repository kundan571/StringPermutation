package com.algorithmprograms;

import java.util.Scanner;

public class StringPermutation {

    public void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left_SubStr = str.substring(0, i);
            String right_SubStr = str.substring(i + 1);
            String restAll = left_SubStr + right_SubStr;
            permute(restAll, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String ans = " ";
        String str = scanner.next();
        StringPermutation permutation = new StringPermutation();
        permutation.permute(str, ans);
    }
}
