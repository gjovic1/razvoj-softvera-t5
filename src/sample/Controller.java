package sample;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    public TextField imeField;
    public TextField prezField;
    public TextField emailField;
    public TextField usernField;
    public TextField passField;
    public ListView userList;
    public ButtonBar dugmici;

    public KorisniciModel model;
    public Button dodajBtn;
    public Button krajBtn;

    @FXML
    public void initialize(){


    }
    public void dodajUsera(ActionEvent actionEvent) {

    }

    public void endProg(ActionEvent actionEvent) {
        Platform.exit();
    }
}
