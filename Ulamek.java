public class Ulamek {
    int licz, mian;

    public Ulamek(int licz, int mian) {
        // Skracanie ułamka (prosty sposób)
        int a = Math.abs(licz), b = Math.abs(mian);
        while (b != 0) { int t = b; b = a % b; a = t; }
        this.licz = licz / a;
        this.mian = mian / a;
    }

    @Override
    public String toString() {
        return (mian == 1) ? "" + licz : licz + "/" + mian;
    }
}