public class Objetos {
   private String nome;
   private Double peso;
   private int cod_de_barras;

    public Objetos() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Objetos(String nome, Double peso, int cod_de_barras) {
        this.nome = nome;
        this.peso = peso;
        this.cod_de_barras = cod_de_barras;
    }

    public int getCod_de_barras() {
        return this.cod_de_barras;
    }

    public void setCod_de_barras(int cod_de_barras) {
        this.cod_de_barras = cod_de_barras;
    }

    

}
