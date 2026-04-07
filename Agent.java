public class Agent extends Osoba {
    public Agent(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void przedstawSie() {
        System.out.println(nazwisko + ", " + imie + " " + nazwisko);
    }
}