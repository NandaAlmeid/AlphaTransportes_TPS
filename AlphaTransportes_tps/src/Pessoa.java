public abstract class Pessoa {
    private int cpf;
    private String nome;
    private int data_nasc;
    private String email;
    private int telefone;


    public Pessoa() {
    }


    public Pessoa(int cpf, String nome, int data_nasc, String email, int telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.email = email;
        this.telefone = telefone;
    }

    

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData_nasc() {
        return this.data_nasc;
    }

    public void setData_nasc(int data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
