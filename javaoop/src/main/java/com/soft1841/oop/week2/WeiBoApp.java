package com.soft1841.oop.week2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WeiBoApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //加载布局文件
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/weibo.fxml"));
        Scene scene = new Scene(root,1900,1000);
        scene.getStylesheets().add(WeiBoApp.class.getResource("/css/Style.css").toExternalForm());
        //设置标题名称
        primaryStage.setTitle("微博");
        //设置窗体logo
        primaryStage.getIcons().add(new Image("/img/logo1.png"));
        //屏幕最大化
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
