public class Osoba {
    protected String imie, nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.println("Cześć, jestem " + imie + " " + nazwisko);
    }
}