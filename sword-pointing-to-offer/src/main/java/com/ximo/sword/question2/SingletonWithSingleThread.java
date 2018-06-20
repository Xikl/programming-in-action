package com.ximo.sword.question2;

/**
 * @author 朱文赵
 * @date 2018/6/20 15:28
 * @description 单例模式 单线程下 多线程下很容易出现多个实例
 *
 */
public class SingletonWithSingleThread {

    private SingletonWithSingleThread() {
    }

    private static SingletonWithSingleThread instance;

    public static SingletonWithSingleThread getInstance() {
        if (instance == null) {
            return new SingletonWithSingleThread();
        }
        return instance;
    }

}
