package menu;
import validadores.Validador;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastro implements Validador{
     

    private String nome;
    private long numero;
    private int digito;
    public TelaCadastro() {
    }

    public int telaCadastro() {
        JTextField nome = new JTextField(30);
        JTextField numero = new JTextField(9);
        JTextField digito = new JTextField(2);
        JPanel cadastroCliente = new JPanel();
        cadastroCliente.add(new JLabel("Nome:"));
        cadastroCliente.add(nome);
        cadastroCliente.add(new JLabel("CPF:"));
        cadastroCliente.add(numero);
        cadastroCliente.add(new JLabel("Digito:"));
        cadastroCliente.add(digito);
        int panel = JOptionPane.showConfirmDialog(null, cadastroCliente, "Cadastro Cliente",
                JOptionPane.OK_CANCEL_OPTION);

        
        if(nome.getText().length() == 0){
            JOptionPane.showMessageDialog(cadastroCliente, "Insira um nome válido");
        }else{
            this.nome = nome.getText();
        }
        this.numero = Long.parseLong(numero.getText());
        this.digito = Integer.parseInt(digito.getText());
        
        return panel;

    }

    

    public String getNome(){
        return this.nome;
    }

    public long getNumero(){
        return this.numero;
    }

    
    public int getDigito(){
        return this.digito;
    }
}
