package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KorisnikTest {

    @Test
    void getIme() {
    }

    @Test
    void imeProperty() {
        Korisnik k = new Korisnik();
        k.setIme("Bakir");
        assertEquals("Bakir", k.imeProperty());
    }

    @Test
    void setIme() {
    }

    @Test
    void getPrezime() {
    }

    @Test
    void prezimeProperty() {
        Korisnik k = new Korisnik();
        k.setPrezime("Karovic");
        assertEquals("Karovic", k.prezimeProperty());
    }

    @Test
    void setPrezime() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void emailProperty() {
        Korisnik k = new Korisnik();
        k.setEmail("bkarovic1@etf.unsa.ba");
        assertEquals("bkarovic1@etf.unsa.ba", k.emailProperty());
    }

    @Test
    void setEmail() {
    }

    @Test
    void getUsername() {
    }

    @Test
    void usernameProperty() {
        Korisnik k = new Korisnik();
        k.setUsername("bake");
        assertEquals("bake", k.usernameProperty());
    }

    @Test
    void setUsername() {
    }

    @Test
    void getLozinka() {
    }

    @Test
    void lozinkaProperty() {
        Korisnik k = new Korisnik();
        k.setLozinka("staktrekfan123");
        assertEquals("startrek123", k.lozinkaProperty());
    }

    @Test
    void setLozinka() {
    }
}