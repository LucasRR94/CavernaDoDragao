 

public class Item {
	protected String nome;
	protected String descricao;
	
	
	public Item(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String pegaNome() {
		return nome;
	}
	
	public String pegaDescricao() {
		return descricao;
	}
}
