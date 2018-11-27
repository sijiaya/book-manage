package com.soft1841.oop.week1;

import javafx.scene.control.Button;


/**
 * 自定义按钮
 */
public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽高,背景色的按钮
    public MyButton(){
        //给当前按钮设置合适的尺寸
        this.setPrefSize(82,18);
        //给当前按钮设置背景色,字体大小，字的颜色
        this.setStyle("-fx-background-color: rgb(230,56,47);" +
                "-fx-text-fill: rgb(254,250,250);"+
                "-fx-font-family: 'Adobe 黑体 Std R';"+"-fx-border-color: rgb(238,34,14);");
    }
}
