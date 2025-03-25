import java.util.Scanner;

class C {
    private String t;
    private int n;
    private double s;

    C(String t, int n, double s) { this.t = t; this.n = n; this.s = s; }
    double c() { return s; }
    boolean s(double v) { if (v > s) return false; s -= v; return true; }
    void d(double v) { s += v; }
}

public class M {
    public static void main(String[] a) {
        Scanner x = new Scanner(System.in);
        C c = new C(x.nextLine(), x.nextInt(), x.nextDouble());

        if (x.hasNextDouble() && !c.s(x.nextDouble())) {
            System.out.println("Saque invalido: Saldo insuficiente\nSaldo Atual: " + String.format("%.2f", c.c()));
            return;
        }
        if (x.hasNextDouble()) c.d(x.nextDouble());
        System.out.println("Saldo Atualizado: " + String.format("%.2f", c.c()));

        x.close();
    }
}
