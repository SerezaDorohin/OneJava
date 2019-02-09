package com.oneJava.stepik.course_2.lesson_2_4;

public class MergeArrays {
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int [a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;
        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }
}
