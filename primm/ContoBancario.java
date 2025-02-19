package primm;

public class ContoBancario {
    private String numeroConto;
    private double saldo;
    public String titolare;

    ContoBancario(String numeroConto, double saldo, String titolare) {
        this.numeroConto = numeroConto;
        if (saldo >= 0)
            this.saldo = saldo;
        this.titolare = titolare;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
            System.out.println("saldo aggiornato correttamente");
        }
        else {
            System.out.println("non è possibile aggiornare con cifra negativa");
        }
    }

    public void deposita(double importo) {
        if (importo >= 0) {
            this.saldo += importo;
            System.out.println("hai despositato " + importo + " euro");
        }
        else
            System.out.println("non puoi depositare una cifra negativa");
    }

    public void preleva(double importo) {
        if (this.saldo >= importo) {
            this.saldo -= importo;
            System.out.println("hai prelevato " + importo + " euro");
        }
        else
            System.out.println("non puoi prelevare una cifra maggiore del tuo saldo");
    }
}
