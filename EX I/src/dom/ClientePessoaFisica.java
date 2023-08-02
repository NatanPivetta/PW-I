package dom;

public class ClientePessoaFisica extends Cliente {
    private String nome;
    private CPF cpf;
    public ClientePessoaFisica(String nome, Endereco end, String tel, CPF cpf){
        super(end, tel);
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        String s;
        s = "Nome: " + this.nome + "\n" +
            "CPF: " + this.cpf + "\n" +
            super.toString();
        return s;
    }
}
