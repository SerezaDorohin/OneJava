package com.oneJava.lesson11_12_13;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(filterEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,7,7,7,78})));
    }
    public static int[] mas;
    public static int[] filterEven(int[] nums) {
        mas = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = 0;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int num : nums) {
            if (num != 0) {
                str.append(num);
            }
        }
        String[] end = str.toString().split("");

        for (int i = 0; i < end.length; i++) {
            String symbol = end[i];
            mas[i] = Integer.parseInt(symbol);
        }
        for (int i = 0; i < (nums.length - mas.length); i++) {
            mas[i] = 0;
        }
        return mas;
    }
}
