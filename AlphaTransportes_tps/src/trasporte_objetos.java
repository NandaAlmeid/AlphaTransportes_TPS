public class trasporte_objetos {
   private int qtd_itens;
   private Double peso_total;

    public trasporte_objetos(int qtd_itens, Double peso_total) {
        this.qtd_itens = qtd_itens;
        this.peso_total = peso_total;
    }

    public trasporte_objetos() {
    }

    public int getQtd_itens() {
        return this.qtd_itens;
    }

    public void setQtd_itens(int qtd_itens) {
        this.qtd_itens = qtd_itens;
    }

    public Double getPeso_total() {
        return this.peso_total;
    }

    public void setPeso_total(Double peso_total) {
        this.peso_total = peso_total;
    }


}
