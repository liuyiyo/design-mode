package com.liuyi.designmode.creational.simplefactory;

/**
 * 简单工厂模式测试类
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //比如我想读java的书籍
//        EBook java = EBookFactory.createEBook("java");
//        java.read();
        EBook java = EBookFactory.createEBook(JavaBook.class);
        java.read();
    }
}
