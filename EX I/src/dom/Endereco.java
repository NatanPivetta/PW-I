package dom;

public class Endereco {
    private String logradouro;
    private String complemento;
    private long cep;

    public Endereco(String l, String c, long cep){
        this.logradouro = l;
        this.complemento = c;
        this.cep = cep;
    }

    @Override
    public String toString(){
        String s;
        s = this.cep + " - " + this.logradouro + "," + this.complemento;
        return s;
    }
}
