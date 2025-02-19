package primm;

public class TestBanca {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("12345", 1000, "Mario Rossi");
        System.out.println("Saldo iniziale: " + conto.getSaldo());

        conto.deposita(500);
        conto.preleva(200);
        conto.preleva(2000); // Dovrebbe fallire
    }
}
