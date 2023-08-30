package validadores;

import java.lang.String;
import documentos.Cpf;

public interface Validador {

	public default boolean validaItem(int num) {
		if (num > 0 && num < 7)
			return true;
		return false;
	}

	public default boolean validaItemConta(int num) {
		if (num > 0 && num < 3)
			return true;
		return false;
	}

	public default boolean validaNome(String nome) {
		if (nome != null && nome.length() > 0)
			return true;
		return false;
	}

	public default boolean validaCpf(Cpf cpf) {
		int dig=11;
		int [] cpfDigitos = new int[11];
		String s = cpf.toString();
		System.out.println(s);
		for(int i=0; i<11;i++){
			cpfDigitos[i] = Character.getNumericValue(s.charAt(i));
			System.out.println(cpfDigitos[i]);
		} // copiar digitos do cpf para um vetor de inteiros

		// verifica primeiro digito
		int sum1 = 0;
        for (int i = 0; i < dig - 2; i++) {
            sum1 += cpfDigitos[i] * (dig - 1 - i);
        }
        int digit1 = dig - (sum1 % dig);
        if (digit1 >= 10) {
            digit1 = 0;
        }

		int sum2 = 0;
        for (int i = 0; i < dig - 1; i++) {
            sum2 += cpfDigitos[i] * (dig - i);
        }
        int digit2 = dig - (sum2 % dig);
        if (digit2 >= 10) {
            digit2 = 0;
        }

		// Verificar os dígitos verificadores
        if (digit1 == cpfDigitos[dig - 2] && digit2 == cpfDigitos[dig - 1]) {
			return true;
        } else {
            return false;
        }
		

		
	}
}
