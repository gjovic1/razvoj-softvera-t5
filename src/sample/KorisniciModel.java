package sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni()
    {
        korisnici.add(new Korisnik("John", "McCann", "jmc@etf.unsa.ba", "mccann123", "wouldyouliketoknow" ));
        korisnici.add(new Korisnik("Dolan", "Dark", "ddark@etf.unsa.ba", "epicdolan", "primetime9214"));
        korisnici.add(new Korisnik("Donald", "Trump", "prez@etf.unsa.ba", "sickprez", "airforceone"));
    }
}
