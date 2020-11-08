package com.liuyi.designmode.creational.simplefactory;

/**
 * C语言书籍
 */
public class CBook implements EBook{
    @Override
    public void read() {
        System.out.println("阅读c语言书籍");
    }
}
