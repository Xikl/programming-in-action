package com.ximo.sword.question4;

import java.util.Arrays;

/**
 * @author 朱文赵
 * @date 2018/6/20 18:07
 * @description
 */
public class StringReplace {

    public static void main(String[] args) {
        String str = "We are happy.";
        System.out.println(str.replace(" ", "%20"));

        String replaceBlankStr = replaceBlank(str.toCharArray());
        System.out.println(replaceBlankStr);
//        replaceBlank(null);
    }

    private static String replaceBlank(char[] charArray) {
        char blankChar = ' ';
        //保证输入鲁棒性
        if (charArray == null) {
            return null;
        }
        int originalLength = charArray.length;
        int numberOfBlank = 0;
        //获得空格出现次数
        for (char c : charArray) {
            if (c == blankChar) {
                numberOfBlank++;
            }
        }
        //没有空格直接返回该字符串
        if (numberOfBlank == 0) {
            return new String(charArray);
        }
        //新建一个新的数组 存放新的字符串 替换一个空格长度增加两个单位
        int newLength = originalLength + 2 * numberOfBlank;
        char[] newCharArray = new char[newLength];
        int indexOfOriginal = originalLength - 1;
        int indexOfNew = newLength - 1;
        while (indexOfOriginal >= 0) {
            //遇到空格的时候
            if (charArray[indexOfOriginal] == blankChar) {
                newCharArray[indexOfNew--] = '0';
                newCharArray[indexOfNew--] = '2';
                newCharArray[indexOfNew--] = '%';
            } else {
                //没有遇到空格的时候
                newCharArray[indexOfNew--] = charArray[indexOfOriginal];
            }
            indexOfOriginal--;
        }
        return new String(newCharArray);

    }

}
