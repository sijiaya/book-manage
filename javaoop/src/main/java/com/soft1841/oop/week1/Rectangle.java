package com.soft1841.oop.week1;

/**
 * 子类，矩形类继承自 形状类
 */
public class Rectangle extends Shape{
    @Override
    public void getArea() {
        //super作用：调用父类方法
        super.getArea();
        int height = 10;
        int width = 5;
        System.out.println(width*height);
    }
}
