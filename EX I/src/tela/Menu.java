package tela;
import util.TecladoPlus;

public class Menu {
    public static enum OpcoesTelaPrincipal {VAZIO, CADASTRAR, PESQNOME, PESQCPF, PESQEND, LIST, SAIR};

    public OpcoesTelaPrincipal menuPrincipal(){
        OpcoesTelaPrincipal op = OpcoesTelaPrincipal.VAZIO;
        System.out.println("===========================================");
        System.out.println("=== 1 - Cadastrar Cliente Pessoa Física ===");
        System.out.println("=== 2 - Pesquisar Cliente pelo Nome     ===");
        System.out.println("=== 3 - Pesquisar Cliente pelo CPF      ===");
        System.out.println("=== 4 - Pesquisar Cliente pelo Endereço ===");
        System.out.println("=== 5 - Listar todos os Clientes        ===");
        System.out.println("================ 6 - SAIR =================");
        System.out.println("===========================================");

        int i = TecladoPlus.leInteiro("Escolha uma opção: ");
        op = OpcoesTelaPrincipal.values()[i];
        return op;
    }
}
