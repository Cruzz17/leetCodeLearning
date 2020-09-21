package Thread;

/**
 * 单例模式
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public synchronized static Singleton getUniqueInstance(){
        //先判断对象是否实例化
            //先判断对象是否已经实例过，没有实例化过才进入加锁代码
            if (uniqueInstance == null) {
                //类对象加锁
                synchronized (Singleton.class) {
                    if (uniqueInstance == null) {
                        /**
                         * 分为三部
                         * 为 uniqueInstance 分配内存空间
                         * 初始化 uniqueInstance
                         * 将 uniqueInstance 指向分配的内存地址
                         */
                        uniqueInstance = new Singleton();
                    }
                }
            }
        return uniqueInstance;
    }

}
