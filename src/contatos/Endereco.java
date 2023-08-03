package contatos;

public class Endereco {
    private String logradouro;
    private String complemento;
    private long cep;

    public Endereco() {}
    public Endereco(String l, String c, long cep){
        this.logradouro = l;
        this.complemento = c;
        this.cep = cep;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getComplemento(){
        return this.complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public long getCep(){
        return this.cep;
    }

    public void setCep(long cep){
        this.cep = cep;
    }

    @Override
    public String toString(){
        String s;
        s = this.cep + " - " + this.logradouro + ", " + this.complemento;
        return s;
    }
}
