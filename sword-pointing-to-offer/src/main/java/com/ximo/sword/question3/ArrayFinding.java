package com.ximo.sword.question3;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

/**
 * @author 朱文赵
 * @date 2018/6/20 16:09
 * @description 数组查找
 */
public class ArrayFinding {

    private static int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

    public static void main(String[] args) {
        int value = 20;
        System.out.println(isExist(array, value));
    }


    private static boolean isExist(@NotNull int[][] array, int value) {
        if (array == null) {
            throw new RuntimeException("数组不能为空");
        }
        int rowSize = array[0].length;
        int colSize = array.length;
        //获取数组右上角的数组
        if (rowSize > 0) {
            int curRow = 0;
            int curCol = colSize - 1;
            while (curRow < rowSize && curCol >= 0) {
                int curValue = array[curRow][curCol];
                //刚好命中 返回true
                if (curValue == value) {
                    return true;
                } else if (curValue > value) {
                    //不满足则列右移
                    curCol--;
                } else {
                    //不满足则行下移
                    curRow++;
                }
            }
        }
        //循环结束 找不到 返回false
        return false;
    }

}
