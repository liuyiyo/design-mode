package com.liuyi.designmode.creational.simplefactory;

/**
 * java语言书籍
 */
public class JavaBook implements EBook {
    @Override
    public void read() {
        System.out.println("阅读java语言书籍");
    }
}
