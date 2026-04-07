public class BuforCykliczny {
    Ulamek[] tab = new Ulamek[4];
    int head = 0, tail = 0, ile = 0;

    public void dodaj(Ulamek u) {
        if (ile == tab.length) zmien(tab.length * 2); // Za mało miejsca -> powiększ
        tab[tail] = u;
        tail = (tail + 1) % tab.length; // Zawijanie (kółko)
        ile++;
    }

    public Ulamek pobierz() {
        if (ile == 0) return null;
        Ulamek u = tab[head];
        tab[head] = null; // Czyścimy miejsce
        head = (head + 1) % tab.length; // Zawijanie
        ile--;
        if (ile > 0 && ile <= tab.length / 4) zmien(tab.length / 2); // Za dużo miejsca -> pomniejsz
        return u;
    }

    private void zmien(int nowyRozmiar) {
        Ulamek[] nowa = new Ulamek[nowyRozmiar];
        for (int i = 0; i < ile; i++) {
            nowa[i] = tab[(head + i) % tab.length];
        }
        tab = nowa;
        head = 0;
        tail = ile;
    }

    public void wypisz() {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((tab[i] == null ? "" : tab[i]) + (i < tab.length - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}