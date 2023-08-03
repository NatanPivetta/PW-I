import documentos.CPF;
import contatos.Endereco;
import clientes.Cliente;
import clientes.ClientePessoaFisica;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        List<Endereco> enderecos = new ArrayList<>();
        CPF cpf = new CPF(853701420, 68);
        Endereco end1 = new Endereco("Estrada João Salomoni", "721", 91740830);
        Endereco end2 = new Endereco("Rua Joaquim de Carvalho", "45", 91740830);
        enderecos.add(end1);
        enderecos.add(end2);
       ClientePessoaFisica cli = new ClientePessoaFisica(enderecos, "51994124578", "Natan", cpf);
       System.out.println(cli.toString());
    }
}
