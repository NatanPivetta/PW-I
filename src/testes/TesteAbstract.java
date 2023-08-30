package testes;
import contas.*;
import java.util.*;

public class TesteAbstract {
   public static void main(String[] args) {
	  //classe abastrata não pode ser instanciada
	  //Conta conta = new Conta();
	  
	  ContaEspecial ce = new ContaEspecial();
	  ce.getNumero();
	  
	  Conta vet[] = new Conta[6];
	  //classe abastrata não pode ser instanciada
	  //vet[1] = new Conta();
	  
	  List<Conta> lista = new ArrayList<>();
   }
}
