package ca.nscc.simplehandleevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * HandleEvent.java
 * Author: David Kristiansen (W0242502)
 * Date: 2024-10-22
 * Time: 1:04 a.m.
 * Description: Demo button events.
 */
public class HandleEvent extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk = new Button("OK");
        Button btCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOk.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOk, btCancel);

        Scene scene = new Scene(pane);
        stage.setTitle("HandleEvent");
        stage.setScene(scene);
        stage.show();
    }

    class OKHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            System.out.println("OK button clicked");
        }
    }

    class CancelHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            System.out.println("Cancel button clicked");
        }
    }
}
