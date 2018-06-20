package com.ximo.sword.question2;

/**
 * @author 朱文赵
 * @date 2018/6/20 15:57
 * @description
 */
public class SingletonMain {

    public static void main(String[] args) {
        SingletonWithEnum instance = SingletonWithEnum.INSTANCE;
        SingletonWithHolder instance1 = SingletonWithHolder.getInstance();
        SingletonWithOneLoading instance2 = SingletonWithOneLoading.getInstance();
        SingletonWithSingleThread instance3 = SingletonWithSingleThread.getInstance();
        SingletonWithSynchronized instance4 = SingletonWithSynchronized.getInstance();
    }


}
