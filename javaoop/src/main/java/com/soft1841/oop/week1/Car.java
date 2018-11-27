package com.soft1841.oop.week1;

/**
 * 子类，汽车类继承交通工具类
 */
public class Car extends Vehicle{
    @Override
    public void move() {
        super.move();
        System.out.println("汽车在公路上行驶");
    }
}
