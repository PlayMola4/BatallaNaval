package com.example.batallanaval;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class ControldeJuego {

    @FXML
    private Label labelBarco;
    @FXML
    private Button btnEmpezarJuego;

    public void moverBarco() {
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(labelBarco.layoutXProperty(), labelBarco.getLayoutX() + 100);
        KeyFrame kf = new KeyFrame(Duration.INDEFINITE, kv);
        timeline.getKeyFrames().add(kf);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    public void btnEmpezarJuego(ActionEvent actionEvent) {
        moverBarco();
    }
}