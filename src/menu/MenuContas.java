package menu;

public enum MenuContas {
    CONTA_COMM(1, "Conta Comum"), 
	CONTA_ESPEC(2, "Conta Especial"), 
	SAIR(3, "Sair");

    private int numMenu;
	private String textoMenu;
    private MenuContas(int numMenu, String textoMenu) {
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
