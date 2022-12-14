public class App {
    public static void main(String[] args) throws Exception {

        // Criacao de Objetos
        Cliente cliente = new Cliente();
        Motorista motorista1 = new Motorista();

        cliente.setNome("Fernanda");
        cliente.setCpf(58755);
        cliente.setData_nasc(20/04/2005);
        cliente.setTelefone(991092454);
        cliente.setEmail("fernanda@gmail");



        motorista1.setNome("Carlos");

        Endereco partida = new Endereco_Partida(15, "Rua Joao Almeida", "Centro", "Sao paulo", "Brasil", 45345, "Sao Paulo");
        Endereco destino = new Endereco_Partida(15, "Rua X", "Centro", "Colinas", "Brasil", 100058, "Tocantins");
        
        Servico servico01 = new Servico();

        servico01.setDescricao("Serviço com a melhor qualidade");
        servico01.setPreco(3000);
        servico01.setIdServico(2);
        servico01.setPartida(partida);
        servico01.setDestino(destino);
        servico01.setMotorista(motorista1);
        servico01.setCliente(cliente);

        System.out.println(servico01.toString());


        cliente.setNome("Fernanda");



        


    }
}
