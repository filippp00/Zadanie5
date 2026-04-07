public class Ulamek {
    int licz, mian;

    // Konstruktor - tworzy ułamek i od razu go skraca
    public Ulamek(int licz, int mian) {
        // Strażnik: nie pozwalamy na zero w mianowniku
        if (mian == 0) {
            throw new IllegalArgumentException("Mianownik nie może być zerem!");
        }

        // Obsługa znaków: minus ma być zawsze w liczniku
        if (mian < 0) {
            licz = -licz;
            mian = -mian;
        }

        // Algorytm Euklidesa do znalezienia NWD
        int a = Math.abs(licz);
        int b = mian;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        // Skracanie ułamka przez NWD
        this.licz = licz / a;
        this.mian = mian / a;
    }

    // DODAWANIE: a/b + c/d = (a*d + c*b) / (b*d)
    public Ulamek dodaj(Ulamek u) {
        int nowyLicznik = (this.licz * u.mian) + (u.licz * this.mian);
        int nowyMianownik = this.mian * u.mian;
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    // ODEJMOWANIE: a/b - c/d = (a*d - c*b) / (b*d)
    public Ulamek odejmij(Ulamek u) {
        int nowyLicznik = (this.licz * u.mian) - (u.licz * this.mian);
        int nowyMianownik = this.mian * u.mian;
        return new Ulamek(nowyLicznik, nowyMianownik);
    }

    // MNOŻENIE: (a/b) * (c/d) = (a*c) / (b*d)
    public Ulamek pomnoz(Ulamek u) {
        return new Ulamek(this.licz * u.licz, this.mian * u.mian);
    }

    // DZIELENIE: (a/b) / (c/d) = (a*d) / (b*c)
    public Ulamek podziel(Ulamek u) {
        if (u.licz == 0) {
            throw new ArithmeticException("Nie można dzielić przez ułamek o liczniku 0!");
        }
        return new Ulamek(this.licz * u.mian, this.mian * u.licz);
    }

    // DODAWANIE LICZBY CAŁKOWITEJ
    public Ulamek dodajLiczbe(int n) {
        return this.dodaj(new Ulamek(n, 1));
    }

    // Wypisywanie: 2 zamiast 2/1, 1/2 zamiast 4/8
    @Override
    public String toString() {
        if (mian == 1) {
            return "" + licz;
        }
        return licz + "/" + mian;
    }
}
