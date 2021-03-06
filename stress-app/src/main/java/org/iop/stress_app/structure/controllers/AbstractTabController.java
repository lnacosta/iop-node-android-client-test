package org.iop.stress_app.structure.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import org.iop.stress_app.structure.core.StressAppCoreManager;
import org.iop.stress_app.structure.views.IntegerSpinner;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class contains all the functionality for the tabs implemented in this app
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 22/08/16.
 */
public abstract class AbstractTabController implements Initializable {

    /**
     * Represents the JavaFx textField containing the connections number.
     */
    @FXML
    protected IntegerSpinner tabSpinner;

    /**
     * Represents the button present in the tab
     */
    @FXML
    protected Button tabButton;

    /**
     * Represents the label indicating the state of the test
     */
    @FXML
    protected Label actionTarget;

    /**
     * Represents the number of tests to test.
     */
    protected int connections = 0;

    /**
     * Represents if the test has stated.
     */
    protected boolean isStart = false;

    /**
     * Represents the StressAppCoreManager.
     */
    protected StressAppCoreManager coreManager = new StressAppCoreManager();

    protected static int DEFAULT_CONNECTIONS_TO_SET = 5;

    /**
     * This method handle the click event on <b>Start</b> button
     * @param event
     */
    @FXML
    protected void handleStartButtonAction(ActionEvent event) {
        executeTest();
    }

    /**
     * This method change the text from the tab button
     */
    protected void changeButtonText(){
        this.tabButton.setText("Add");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Not implemented in this version
    }

    /**
     * This method must implement the main test
     */
    protected abstract void executeTest();
}
