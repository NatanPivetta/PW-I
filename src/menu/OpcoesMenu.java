package menu;

public enum OpcoesMenu {
	CADASTRAR(1, "Cadastrar Cliente"), 
	LIST_TOTAL(2, "Listar total de clientes"), 
	PESQ_NOME(3, "Pesquisar Cliente pelo nome"),
	PESQ_CPF(4, "Pesquisar Cliente pelo CPF"),
	LISTAR_TODOS(5, "Listar todos os clientes"),
	SAIR(6, "Sair");
	
	private int numMenu;
	private String textoMenu;
	private OpcoesMenu(int numMenu, String textoMenu) {
		this.numMenu = numMenu;
		this.textoMenu = textoMenu;
	}
	public int getNumMenu() {
		return numMenu;
	}
	public String getTextoMenu() {
		return textoMenu;
	}
	public String getItem() {
		return this.getNumMenu() + " - " + this.getTextoMenu();
	}
}
