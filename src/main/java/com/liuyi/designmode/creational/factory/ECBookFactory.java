package com.liuyi.designmode.creational.factory;

/**
 * 创建C语言书籍的具体工厂类
 */
public class ECBookFactory implements EBookFactory{

    public EBook createEBook(){
        EBook eBook = new CBook();
        return eBook;
    }
}
