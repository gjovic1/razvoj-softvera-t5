package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    public TextField imeField;
    public TextField prezField;
    public TextField emailField;
    public TextField usernField;
    public TextField passField;

    private KorisniciModel model;

    @FXML
    public void initialize(){
        imeField.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        prezField.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        emailField.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
        usernField.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
        passField.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
    }
}
