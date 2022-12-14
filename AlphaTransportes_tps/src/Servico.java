public class Servico {

    private int idServico;
    private float preco;
    private String descricao;
    private Motorista motorista;
    private Endereco partida;
    private Endereco destino;
    private Cliente cliente;

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }





    public Servico() {
    }



    public Servico(int idServico, float preco, String descricao, Motorista motorista, Endereco partida, Endereco destino) {
        this.idServico = idServico;
        this.preco = preco;
        this.descricao = descricao;
        this.motorista = motorista;
        this.partida = partida;
        this.destino = destino;
    }


    public Endereco getPartida() {
        return this.partida;
    }

    public void setPartida(Endereco partida) {
        this.partida = partida;
    }

    public Endereco getDestino() {
        return this.destino;
    }

    public void setDestino(Endereco destino) {
        this.destino = destino;
    }

    public Motorista getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }



    public int getIdServico() {
        return this.idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "{" +
            " idServico='" + getIdServico() + "\n" +
            ", preco='" + getPreco() + "\n" +
            ", descricao='" + getDescricao() + "\n" +
            ", motorista='" + getMotorista().getNome() + "\n" +
            ", partida='" + getPartida().toString() + "\n" +
            ", destino='" + getDestino().toString() + "\n" +
            "}";
    }



}
