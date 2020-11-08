package com.liuyi.designmode.creational.simplefactory;

/**
 * 创建不同种类的电子书的简单工厂类
 */
public class EBookFactory {
//    public static EBook createEBook(String type){
//        EBook eBook;
//        switch (type){
//            case "java":
//                eBook = new JavaBook();
//                break;
//            case "c":
//                eBook = new CBook();
//                break;
//            default:
//                throw new RuntimeException("当前电子书不存在");
//        }
//        return eBook;
//    }
    public static EBook createEBook(Class<? extends EBook> clazz){
        EBook eBook = null;
        try {
            if(clazz!=null){
                eBook = clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eBook;
    }
}
