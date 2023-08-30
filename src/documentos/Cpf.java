package documentos;
import java.util.Objects;

public final class Cpf {
	private long numero;
	private int digito;

	public Cpf() {}
	public Cpf(long numero, int digito) {
		this.numero = numero;
		this.digito = digito;
	}
	public long getNumero() {		return numero;	}
	public void setNumero(long numero) {		this.numero = numero;	}
	public int getDigito() {		return digito;	}
	public void setDigito(int digito) {		this.digito = digito;	}
	
	@Override
	public String toString() {
		return numero + "" + digito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(digito, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cpf other = (Cpf) obj;
		return digito == other.digito && numero == other.numero;
	}
	
	
}
