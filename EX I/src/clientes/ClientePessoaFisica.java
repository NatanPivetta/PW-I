package clientes;
import contatos.Endereco;
import documentos.CPF;
import java.util.*;

public class ClientePessoaFisica extends Cliente {
    private String nome;
    private CPF cpf;

    public ClientePessoaFisica() {}
    public ClientePessoaFisica(List<Endereco> end, String tel, String nome, CPF cpf){
        super(end, tel);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public CPF getCpf(){
        return this.cpf;
    }
    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        String s;
        s = "Nome: " + nome + "\n" +
            "CPF: " +(cpf==null?"CPF não informado": cpf.toString())  + "\n" +
            super.toString();
        return s;
    }
}
