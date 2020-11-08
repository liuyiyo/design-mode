package com.liuyi.designmode.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单工厂模式测试类
 */
public class FactoryTest {
    public static final Logger logger = LoggerFactory.getLogger(FactoryTest.class);

    public static void main(String[] args) {
        logger.info("比如我想读java的书籍");
        //比如我想读java的书籍
        //用java工厂类创建
        EBookFactory javaFactory = new EJavaBookFactory();
        EBook eBook = javaFactory.createEBook();
        eBook.read();
    }
}
