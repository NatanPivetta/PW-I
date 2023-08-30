package testes;
import clientes.*;
import documentos.Cpf;

public class TesteContador {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		System.out.println(cli1.toString());
		Cliente cli2 = new Cliente("Fulano", new Cpf(1223325, 78), null);
		System.out.println(cli2.toString());
	}
}
