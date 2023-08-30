package menu;

import java.util.ArrayList;
import java.util.List;

import menu.TelaCadastro;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import clientes.Cliente;
import contas.*;
import documentos.Cpf;
import validadores.Validador;

public class Menu implements Validador {

	public static void main(String[] args) {
		Menu menu = new Menu();
		List<Cliente> clientes = new ArrayList<>();
		List<Conta> contas = new ArrayList<>();
		while (true) {
			int opcao = menu.montaMenu();
			if (menu.validaItem(opcao)) {
				switch (opcao) {
					case 1:
						TelaCadastro telaCadastro = new TelaCadastro();
						telaCadastro.telaCadastro();
						String nomeCliente = telaCadastro.getNome();
						long numCpf = telaCadastro.getNumero();
						int digCpf = telaCadastro.getDigito();
						System.out.println(numCpf);
						System.out.println(digCpf);

						Cpf cpf = new Cpf(numCpf, digCpf);
						if (!menu.validaCpf(cpf)) {
							JOptionPane.showMessageDialog(null, "CPF Inválido!");

						} else {
							Cliente cli = new Cliente();
							cli.setNome(nomeCliente);
							cli.setCpf(cpf);

							switch (opcao = menu.montaMenuContas()) {
								case 1:

									Conta conta = new ContaEspecial(0, 0, 0);
									conta.setNumero(conta.getNumero());
									contas.add(conta);
									cli.setContas(contas);
									// op = JOptionPane.showOptionDialog(null, "Deseja adicionar mais contas?",
									// "Adicionar Conta", JOptionPane.YES_NO_OPTION,
									// JOptionPane.INFORMATION_MESSAGE, null, null, null);

									break;
								case 2:

									Conta contaEsp;
									contaEsp = new ContaEspecial(0, 0, 0);
									contaEsp.setNumero(contaEsp.getNumero());
									contas.add(contaEsp);
									cli.setContas(contas);
									// op = JOptionPane.showOptionDialog(null, "Deseja adicionar mais contas?",
									// "Adicionar Conta", JOptionPane.YES_NO_OPTION,
									// JOptionPane.INFORMATION_MESSAGE, null, null, null);

									break;
								case 3:
									System.exit(0);
								default:
									JOptionPane.showMessageDialog(null, "Opção inválida!");
									break;
							}
							clientes.add(cli);
						}

						break;
					case 2:
						System.out.println(clientes.size());
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						if (clientes != null) {
							for (Cliente cliente : clientes) {
								if (cliente != null) {
									JOptionPane.showMessageDialog(null, cliente.toString());
								}
							}
						}
						break;
					case 6:
						System.exit(0);
						break;

				}
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}

	private int montaMenu() {
		String str = "";
		for (OpcoesMenu opcaoMenu : OpcoesMenu.values())
			str += opcaoMenu.getNumMenu() + " " +
					opcaoMenu.getTextoMenu() + "\n";
		return Integer.parseInt(JOptionPane.showInputDialog(str));

	}

	private int montaMenuContas() {
		String str = "";
		for (MenuContas op : MenuContas.values())
			str += op.getNumMenu() + " " +
					op.getTextoMenu() + "\n";
		return Integer.parseInt(JOptionPane.showInputDialog(str));
	}
}
