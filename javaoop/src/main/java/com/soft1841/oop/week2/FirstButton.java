package com.soft1841.oop.week2;

import javafx.scene.control.Button;

public class FirstButton extends Button {
    //自定义构造方法，实现一个指定宽高,背景色的按钮
    public FirstButton(){
        //给当前按钮设置合适的尺寸
        this.setPrefSize(140,50);
        //给当前按钮设置背景色，字体大小，字的颜色
        this.setStyle("-fx-background-color: rgb(250,250,250);" + "-fx-text-fill:rgb(0,0,0);"
                +"-fx-font-family: 'Adobe 黑体 Std R';");
        this.setStyle("");
    }
}