package com.ximo.sword.question11;

/**
 * @author 朱文赵
 * @date 2018/9/19 8:58
 * @description
 */
public class Power {

    public static void main(String[] args) {
        System.out.println(power(2, 7));
    }

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        // 指数 右移一位 == 处于2
        double result = power(base, exponent >> 1);
        result *= result;

        // 如果是奇数
        if ((exponent & 0x1) == 1) {
            result *= base;
        }
        return result;
    }


}
