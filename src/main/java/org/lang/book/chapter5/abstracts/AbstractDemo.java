package org.lang.book.chapter5.abstracts;

public abstract class AbstractDemo {
    public AbstractDemo() {}
    
    //对于抽象类而言，这个抽象方法不是必须的。
    //但是如果类中某方法被声明为abstract，则这个类一定是abstract类
    public abstract void work();
}
