package clientes;
import java.util.List;

import contas.Conta;
import documentos.Cpf;

public class Cliente {
	private String nome;
	private Cpf cpf;
	private List<Conta> contas;
	private static int contador = 0;
	
	public Cliente() {
		//a linha abaixo chama o construtor que tem 3 param.
		this(null, null, null);
	}
	public Cliente(String nome, Cpf cpf, List<Conta> contas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.contas = contas;
		contador++;
	}
	@Override
	public String toString() {
		String aux = "";
		if(contas!=null && !contas.isEmpty()) {
			for (Conta conta : contas) {
				if(conta != null)
				   aux += conta.toString() + "\n";
			}
		}
		return "Cliente \n" + (nome!=null?nome:"Nome inválido\n") + "\n" +
				              "CPF: " + (cpf!=null?cpf.toString():"Cpf inválido\n")
				              + "cont: "+ contador + aux;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cpf getCpf() {
		return cpf;
	}
	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}
	public static int getContador() { 
		return contador;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}
