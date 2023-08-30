package contas;

public abstract class Conta {
	private static int numero = 0;
	private double saldo;
	
	public Conta() {}
	public Conta(int numero, double saldo) {
		super();
		this.saldo = saldo;
		this.numero +=numero;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double credita(double valor) {
		return saldo+=valor;
	}
	public abstract double debita(double valor);
	
}
