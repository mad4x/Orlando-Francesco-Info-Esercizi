package primm;

public class TestAuto {
    public static void main(String[] args) {
        Auto miaAuto = new Auto("Fiat", "Panda", 2020, "Rosso");
        miaAuto.mostraInfo();
        miaAuto.cambiaColore("Blu");
        miaAuto.mostraInfo();
    }
}
