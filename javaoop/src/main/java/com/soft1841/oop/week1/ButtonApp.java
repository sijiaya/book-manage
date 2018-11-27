package com.soft1841.oop.week1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class ButtonApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //加载布局文件
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/button.fxml"));
        //设置标题名称
        primaryStage.setTitle("京东");
        Scene scene = new Scene(root,1900,1000);
        //设置窗体logo
        primaryStage.getIcons().add(new Image("/img/logo.png"));
        //舞台设置背景
        primaryStage.setScene(scene);
        //舞台可见
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
