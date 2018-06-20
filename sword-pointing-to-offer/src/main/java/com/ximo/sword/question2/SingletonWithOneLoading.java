package com.ximo.sword.question2;

/**
 * @author 朱文赵
 * @date 2018/6/20 15:46
 * @description 在初始化的时候直接实例化
 */
public class SingletonWithOneLoading {

    private static SingletonWithOneLoading instance = new SingletonWithOneLoading();

    private SingletonWithOneLoading() {
    }

    /**
     * 这种方法 会在此类初始化的时候 就进行加载
     * 没有达到懒汉的效果
     *
     * @return 实例
     */
    public static SingletonWithOneLoading getInstance() {
        return instance;
    }
}
