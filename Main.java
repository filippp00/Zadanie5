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
    }
}