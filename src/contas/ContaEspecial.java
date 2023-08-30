package contas;

public class ContaEspecial extends Conta {
	private double limite;
	public ContaEspecial() {}
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;

	}
	@Override
	public String toString() {
		return super.toString() + limite;
	}
	public double getLimite() {	return limite;}
	public void setLimite(double limite) {	this.limite = limite;	}
	@Override
	public double debita(double valor) {
		if(getSaldo()+limite<=valor)
			setSaldo(getSaldo()-valor);
		return getSaldo();
	}
}
