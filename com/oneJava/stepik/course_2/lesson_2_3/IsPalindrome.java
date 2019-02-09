package com.oneJava.stepik.course_2.lesson_2_3;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder tex = new StringBuilder(text.toLowerCase());
        StringBuilder xet = new StringBuilder();
        xet.append(tex);
        xet = xet.reverse();
        return xet.toString().equals(tex.toString());
    }
}
