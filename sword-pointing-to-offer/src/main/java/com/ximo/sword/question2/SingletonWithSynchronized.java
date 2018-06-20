package com.ximo.sword.question2;

/**
 * @author 朱文赵
 * @date 2018/6/20 15:42
 * @description 单例类通过同步关键字来决定 效率很低 ，因为绝大部分时间都是已经存在
 */
public class SingletonWithSynchronized {

    private static SingletonWithSynchronized instance;

    private SingletonWithSynchronized() {
    }

    /**
     * 效率很低 ，因为绝大部分时间都是已经存在该实例
     *
     * @return SingletonWithSynchronized
     */
    public static synchronized SingletonWithSynchronized getInstance() {
        if (instance == null) {
            return new SingletonWithSynchronized();
        }
        return instance;
    }
}
