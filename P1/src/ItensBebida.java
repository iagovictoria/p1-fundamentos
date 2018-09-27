
public class ItensBebida extends Itens {
	private int quantidade;
	

	public ItensBebida(String nome, ItensTipo tipo, double valor, int quantidade) {
		super(nome, tipo, valor);
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
