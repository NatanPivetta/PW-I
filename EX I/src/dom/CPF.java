package dom;

public class CPF {
    private long numero;
    private int digito;

    public CPF(long numero, int digito){
        this.numero = numero;
        this.digito = digito;
    }

    @Override
    public String toString(){
        String s;
        s = this.numero + "-" + this.digito;

        return s;

    }
}
