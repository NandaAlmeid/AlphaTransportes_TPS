public abstract class Endereco {
    private int num_casa;
    private String rua;
    private String bairro;
    private String cidade;
    private String pais;
    private int cep;
    private String estado;


    public Endereco(int num_casa, String rua, String bairro, String cidade, String pais, int cep, String estado) {
        this.num_casa = num_casa;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
        this.estado = estado;
    }


    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getNum_casa() {
        return this.num_casa;
    }

    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    @Override
    public String toString() {
        return "{" +
            " num_casa='" + getNum_casa() + "'" +
            ", rua='" + getRua() + "'" +
            ", bairro='" + getBairro() + "'" +
            ", cidade='" + getCidade() + "'" +
            ", pais='" + getPais() + "'" +
            ", cep='" + getCep() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }

}
