package primm;

public class Auto {
    private String marca;
    private String modello;
    private int anno;
    public String colore;

    Auto(String marca, String modello, int anno, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    public int getAnno() {
        return this.anno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void mostraInfo() {
        System.out.println("Marca: " + this.marca +
                        "\nModello: " + this.modello +
                        "\nAnno di produzione: " + this.anno +
                        "\nColore: " + this.colore);
    }

    public void cambiaColore(String colore) {
        System.out.println("Colore modificato da " + this.colore + " a " + colore + "!");
        this.colore = colore;
    }


}
