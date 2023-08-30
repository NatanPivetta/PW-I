package testes;
import contas.*;
public class Teste {

	public static void main(String[] args) {
		Conta conta1 = new ContaEspecial();
		System.out.println(conta1.toString());
	
		ContaEspecial conta3 = new ContaEspecial();
		conta1 = (Conta) conta3;
	}

}
