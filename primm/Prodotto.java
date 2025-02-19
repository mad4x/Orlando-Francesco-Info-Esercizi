package primm;

public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        }
    }

    public void mostraDettagli() {
        System.out.println("Nome: " + this.nome + "\nPrezzo: " + this.prezzo + "\nQuantita: " + quantita);
    }

    public void acquista(int quantita) {
        if (this.quantita - quantita >= 0)
            this.quantita -= quantita;
    }

    public void rifornisci(int pezzi) {
        if (pezzi > 0)
            this.quantita += pezzi;
    }
}
