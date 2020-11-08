package com.liuyi.designmode.creational.factory;

/**
 * 创建java语言书籍的具体工厂类
 */
public class EJavaBookFactory implements EBookFactory{

    public EBook createEBook(){
        EBook eBook = new JavaBook();
        return eBook;
    }
}
