    public Ulamek(int licz, int mian) {
        if (mian == 0) {
            throw new IllegalArgumentException("Mianownik nie może być zerem!");
        }

        // 1. Zabezpieczenie przed ujemnym mianownikiem
        if (mian < 0) {
            licz = -licz; 
            mian = -mian; 
        }

        // 2. Skracanie ułamka (logika Euklidesa, bez zmian)
        int a = Math.abs(licz), b = mian;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        // Zapisanie skróconych wartości
        this.licz = licz / a;
        this.mian = mian / a;
    }
