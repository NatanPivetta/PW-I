package clientes;
import java.util.ArrayList;
import java.util.List;
import contatos.Endereco;

public class Cliente {
    private List <Endereco> end = new ArrayList<>();
    private String telefone;

    public Cliente() {}

    public Cliente(List<Endereco> end, String tel){
        this.end = end;
        this.telefone = tel;
    }

    public void setEndereco(Endereco end){
        this.end.add(end);
    }


    @Override
    public String toString(){
        String s, aux = "";
        for (Endereco end : end){
            if(end != null){
                aux += "\n" + end.toString();
            }
        }
        s = "Endereços:" + aux + "\n" +
        "Telefone: " + this.telefone;
        return s;
    }

}
