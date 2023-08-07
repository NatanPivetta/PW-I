package controlador;

import tela.Menu;

public class CtMenu{
  private Menu menu;
  
  public CtMenu() {
    menu = new Menu();
    iniciar();
  }//CtPrincipal.

  private void iniciar() {
    Menu.OpcoesTelaPrincipal op;
    do {
      op = menu.menuPrincipal();
      switch (op) {
      case CADASTRAR:
        break;
      case PESQNOME:
        break;
      case PESQCPF:
        break;
      case PESQEND:
        break;
      case LIST:
        break;
      case SAIR:
        System.out.println("Saindo...");
        op = Menu.OpcoesTelaPrincipal.VAZIO;
        break;
      default:
        break;
      }//switch
    } while  (op != Menu.OpcoesTelaPrincipal.VAZIO);
  }//iniciar()

  
  
}//CtPrincipal.