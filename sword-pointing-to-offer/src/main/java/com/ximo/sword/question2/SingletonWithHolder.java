package com.ximo.sword.question2;

/**
 * @author 朱文赵
 * @date 2018/6/20 15:50
 * @description
 */
public class SingletonWithHolder {

    private static class SingletonHolder {
        private static SingletonWithHolder instance = new SingletonWithHolder();
    }

    /**
     * 不会再单例加载的时候就行加载，而是调用内部类的时候，才实例化
     * 线程安全和满足懒汉模式
     *
     * @return singleton
     */
    public static SingletonWithHolder getInstance() {
        return SingletonHolder.instance;
    }


}
