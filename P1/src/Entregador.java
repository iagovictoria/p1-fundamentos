
public class Entregador extends Pessoa {
private String placa;

	public Entregador(String nome, String placa) {
		super(nome);
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}
}
