package sample;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

    @FXML
    public void initialize(){

        userList.setItems(model.getKorisnici());

        userList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Korisnik>() {
            @Override
            public void changed(ObservableValue<? extends Korisnik> observableValue, Korisnik korisnik, Korisnik t1) {
                imeField.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
                prezField.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                emailField.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
                usernField.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
                passField.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
                model.setTrenutniKorisnik(t1);
            }
        });
        
    }
    public void dodajUsera(ActionEvent actionEvent) {

    }

    public void endProg(ActionEvent actionEvent) {
        Platform.exit();
    }
}
