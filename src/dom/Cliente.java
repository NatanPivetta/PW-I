package dom;

public class Cliente {
    protected Endereco end;
    protected String telefone;

    public Cliente(Endereco end, String tel){
        this.end = end;
        this.telefone = tel;
    }

    @Override
    public String toString(){
        String s;
        s = "Endereço: " + this.end.toString() + "\n" +
        "Telefone: " + this.telefone;
        return s;
    }

}
