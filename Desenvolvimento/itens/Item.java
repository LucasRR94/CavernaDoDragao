package itens;

public abstract class Item{
	protected String nome;
	protected String descricao;
	protected int peso;
	
	public Item(String nome, String descricao,int peso) {
		this.nome = nome;
		this.descricao = descricao;
                this.peso = peso;
	}
	public void setItem(String nome , String descricao,int peso){
            this.nome = nome;
            this.descricao = descricao;
            this.peso = peso;
        }
        public String getdescricao(){
            return(this.descricao);
        }
	public String pegaNome() {
		return nome;
	}
	public int pegaPeso(){
            return(this.peso);
        }
	public String pegaDescricao() {
		return descricao;
	}
        public String getname(){
            return(this.nome);
        }
        public abstract int getenergy(); //**objeto do tipo alimento retorna acrescrimo energia*/
        public abstract int getvalue(); //**objeto do tipo moeda retorna valor monetario*/
        public abstract int getvaluedefense();//**objeto do tipo item de defesa e magia de defesa retorna atributo de defesa*/
        public abstract int getvalueatack();//**objeto do tipo item de ataque e magia de ataque retorna atributo de ataque*/
        
}
