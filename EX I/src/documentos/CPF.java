package documentos;

public class CPF {
    private long numero;
    private int digito;


    public CPF(){}
    public CPF(long numero, int digito){
        this.numero = numero;
        this.digito = digito;
    }

    
    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return this.digito;
    }
    
    public void setDigito(int digito) {
        this.digito = digito;
    }

    @Override
    public String toString(){
        String s;
        s = this.numero + "-" + this.digito;

        return s;

    }
}
