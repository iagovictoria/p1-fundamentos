
public class Cliente extends Pessoa {
private String end;
private String tel;
private String pontoRef;

	public Cliente(String nome, String end, String tel, String pontoRef) {
		super(nome);
		this.end = end;
		this.tel = tel;
		this.pontoRef = pontoRef;
	}

	public String getEnd() {
		return end;
	}
	
	public String getTel() {
		return tel;
	}
	
	public String pontoRef() {
		return pontoRef;
	}
	
	public void setEnd(String end) {
		this.end = end;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	
}
