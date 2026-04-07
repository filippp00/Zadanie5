public class Main {
    public static void main(String[] args) {
        BuforCykliczny b = new BuforCykliczny();

        // Kroki z zadania:
        b.dodaj(new Ulamek(1, 1)); // dodaj(1)
        b.dodaj(new Ulamek(1, 1)); // dodaj(1)
        b.dodaj(new Ulamek(2, 1)); // dodaj(2)
        b.pobierz();               // pobierz()
        b.dodaj(new Ulamek(2, 1)); // dodaj(2)
        b.pobierz();               // pobierz()
        b.dodaj(new Ulamek(3, 1)); // dodaj(3)

        System.out.print("Wynik wypisz(): ");
        b.wypisz(); 
        
        // Na koniec test Agenta (z Części 1)
        System.out.println("\nTest Agenta:");
        new Agent("James", "Bond").przedstawSie();
        System.out.println("\n--- Testy Arytmetyki Ułamków ---");
        Ulamek u1 = new Ulamek(1, 2);
        Ulamek u2 = new Ulamek(1, 4);

        System.out.println("Dodawanie: " + u1 + " + " + u2 + " = " + u1.dodaj(u2));
        System.out.println("Odejmowanie: " + u1 + " - " + u2 + " = " + u1.odejmij(u2));
        System.out.println("Mnożenie: " + u1 + " * " + u2 + " = " + u1.pomnoz(u2));
        System.out.println("Dzielenie: " + u1 + " / " + u2 + " = " + u1.podziel(u2));
        System.out.println("Dodanie liczby 2 do " + u1 + " = " + u1.dodajLiczbe(2));
        System.out.println("Test ujemnego mianownika (1, -2): " + new Ulamek(1, -2));
    }
}
