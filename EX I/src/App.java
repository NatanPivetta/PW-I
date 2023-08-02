import dom.*;
public class App {
    public static void main(String[] args) throws Exception {
        CPF cpf = new CPF(853701420, 68);
        Endereco end = new Endereco("João Salomoni", "721", 91740830);
        System.out.println(cpf.toString());
        ClientePessoaFisica cli = new ClientePessoaFisica("Natan", end, "51994124578", cpf);
        System.out.println(cli.toString());
    }
}
