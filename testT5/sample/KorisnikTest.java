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
    }

    @Test
    void setPrezime() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void emailProperty() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getUsername() {
    }

    @Test
    void usernameProperty() {
    }

    @Test
    void setUsername() {
    }

    @Test
    void getLozinka() {
    }

    @Test
    void lozinkaProperty() {
    }

    @Test
    void setLozinka() {
    }
}