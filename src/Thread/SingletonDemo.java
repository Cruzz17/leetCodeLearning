package Thread;

public class SingletonDemo {
    private volatile static SingletonDemo singletonDemo;//关键字 和synchronized的区别

    private SingletonDemo(){

    }
    public synchronized  static SingletonDemo getSingletonDemo(){
        if(singletonDemo == null){
            //给类对象加锁
            synchronized (SingletonDemo.class){
                if(singletonDemo == null){
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }

    // volatile 考点  有什么用， 如何用，为什么要用， 防止指令重排序，

    // bean的加载顺序，我一个服务启动起来， 指令排序 1 xml，resouceLoader（） 去xml找到这个bean
    // 给这个bean实例化（jvm 堆里面分配了内存给他）未被引用， 然后再给这个bean进行初始化，set一些属性值

    //实例化过程中的三级缓存，bean的加载 是在3个map里面1，2，3

    // SingletionObjects Map <> 存放实例化bean对象的

    // flag isCreating , 调一级缓存的时候，如果没有，则在三级里面进行创建

    // SingletionEarly Map<> 已经初始化的

    // bean 三级缓存， 我们就直接初始化，不set值 提前曝光，放入二级缓存

    // 内存屏障, 嗅探，总线风暴，解决bean的循环依赖的问题





}
