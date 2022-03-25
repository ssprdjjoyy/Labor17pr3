package com.example.Labor17pr3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Label labelForButtons;

    @FXML
    protected void clickButton1(ActionEvent eventOne) {labelForButtons.setText("Clicked Button1"); }

    @FXML
    protected void clickButton2(ActionEvent eventTwo) {labelForButtons.setText("Clicked Button2"); }

    @FXML
    protected void clickButton3(ActionEvent eventThree) {labelForButtons.setText("Clicked Button3"); }

}