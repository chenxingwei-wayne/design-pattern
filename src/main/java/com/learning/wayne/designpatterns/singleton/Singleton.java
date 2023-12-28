package com.learning.wayne.designpatterns.singleton;


// 单例模式常常用来管理共享的资源，例如数据库连接或者线程池等。
// 单例模式确保一个类只有一个实例，并提供一个全局访问点。
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {

    }

    // 使用synchronized可以解决多线程的问题。但是有个问题，只有第一次执行这个方法的时候才需要同步，设置好了uniqueInstance
    // 后面就不再需要设置了，所以再每次调用这个方法就显得有点累赘了。
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    // 要不要解决上述问题分两种情况：
    // 1. 如果getInstance()的性能不是很关键，保持原来的样子。
    // 2. 立马创建实例， 参考Singleton2的实现。

}
