
public class Itens {
private String nome;
private ItensTipo tipo;
private	double valor;
	

	public Itens(String nome, ItensTipo tipo, double valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ItensTipo getTipo() {
		return tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(ItensTipo tipo) {
		this.tipo = tipo;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
