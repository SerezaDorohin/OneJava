package com.oneJava.lesson11_12_13;

import javax.management.Notification;

import static java.lang.Integer.toBinaryString;
import static java.lang.String.format;

public class HW13L {
    public static void main(String[] args) {
//        System.out.print("RIGHT_SHIFT: "+Integer.toBinaryString(rightShift(0b10000000_00000000_00000000_00000001))+"\n");

        System.out.println(Integer.toBinaryString(swapBits((byte) 0b1111_0000, 0, 6)));
    }

    public static int rightShift(int arg) {
        int result = arg >> 1;
        int x = 0b00111000_11111111_00000000_10101010;

        if (x == (x & arg)) {
            result += 1;
        }

        return result;
    }


    public static byte swapBits(byte b, int i, int j) {

        // создаем маски: бит = 1 позиция !справа!-!налево!
        byte maskOne = (byte) (1 << i);   // получаем - i=0: 0000_0001
        byte maskTwo = (byte) (1 << j);   // еще раз получаеММММММ - j=6: 0100_0000

        byte result = b;                // В нашем случае: 1111_0000

        if ((b & maskOne) != 0) {

            /*
            поставим в этот бит значение 1
            Бит 0 -> 1 /резултат/ |= 1 << 0 в итоге b равняется 1111_0001*/
            result |= maskTwo;

        } else {
            /*
            поставим один бит 0:
            Бит 6 -> 0: [ /резульат/ &= ~(1 << 6) ] и b будет равно 1011_0000
             */
            result &= ~maskTwo;
        }

        // ИСПОЛЬЗУЕМ ДЛЯ ВТОРОЙ МАСКИ
        if ((b & maskTwo) != 0) {
            result |= maskOne;
        } else {
            result &= ~maskOne;
        }

        return result;
    }
}
