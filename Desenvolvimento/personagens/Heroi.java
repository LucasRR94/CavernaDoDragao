package personagens;
import itens.Alimento;
import itens.Arma;
import itens.Defensiva;
import itens.Defesa;
import itens.MagiaAtaque;
import itens.MagiaDefesa;
import itens.Ofensiva;
import itens.Item;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Heroi extends Personagem {
	private int energiaMaxima;
	private int limiteDePeso;
    private Defensiva itensDefesa;
    private Ofensiva  ataque;
    private Map <String, Item> mochila;//**mochila carregara armas,que nao esteja usando , alem de magias*/
	
	public Heroi(String nome,int ataque,int defesa, int energia, int energiaMaxima, int quantidadeDeMoedas){
		super(nome,energia,quantidadeDeMoedas); //**ao criar o heroio ja possuira armas e estas daram o valor do ataque e defesa*/
		super.ataque = ataque; //**atributo inicial diferente de zero*/
        super.defesa = defesa; //**atributo inicial diferente de zero*/
        this.energiaMaxima = energiaMaxima;
        this.itensDefesa = new Defensiva();
        this.ataque = new Ofensiva();
		this.limiteDePeso  = 10000;
		mochila = new HashMap<String, Item>();
	}
        //----------------------------------------------------------------------
	private int calcularPeso() {
		int pesoTotal = 0;
		if(!mochila.isEmpty()){
			for(Item item : mochila.values()) {
				pesoTotal += item.pegaPeso();
			}
		}
		return pesoTotal;
	}
	
	public void inserirItem(Item item) {
		if(item != null){
			if (calcularPeso() + item.pegaPeso() <= limiteDePeso) {
				mochila.put(item.pegaNome(), item);
			} else {
				System.out.println("\n# O " + pegaNome() + " nao pode carregar mais itens na mochila!\n");
			}
		}
	}
	public Item removerItem(String nome) {
		Item item = mochila.get(nome);
		if (item != null)
			mochila.remove(nome);
		else
			System.out.println("\n# O item '" + nome + "' nao esta na mochila do heroi!\n");
		return item;
	}
	
	public void alimentar(String nome) {
		System.out.println(nome);
        Item item = mochila.get(nome);
        if(item != null){
           if(item.getenergy() > 0){ //verificando que eh um alimento
                mochila.remove(nome);
                this.energiaMaxima += item.getenergy();
           }                
        }
        else System.out.println("\n# O item '" + nome + "' nao esta na mochila do heroi!\n");
    }
        
	public void listarItens(){
		if(mochila.isEmpty()){
			System.out.println("\n A mochila está vazia!\n");
		}else{
			for(Item item : mochila.values()) {
				System.out.println(item.pegaNome()+" - "+item.pegaDescricao()+" - "+item.pegaPeso());
            }
		}
    }
	public void usarItem(Item item){
		if(item instanceof Arma){
			this.ataque.setDispositivo((Arma) item);
		}else if(item instanceof MagiaAtaque){
			this.ataque.setMagic((MagiaAtaque) item);
		}else if(item instanceof Defesa){
			this.itensDefesa.setDispositivo((Defesa) item);
		}else if(item instanceof MagiaDefesa){
			this.itensDefesa.setMagic((MagiaDefesa) item);
		}else if(item instanceof Alimento){
			alimentar(item.pegaNome());
		}
	}
	public void lutar(Personagem oponente) {
		int defesaHeroi = super.defesa+this.itensDefesa.getDefesa();
		int ataqueHeroi = super.ataque+this.ataque.getAtaque();
		int defesaOponente = oponente.defesa;
		int ataqueOponente = oponente.ataque;
		
		//Turno heroi ataca
		if(!oponente.estaMorto()){
			if (ataqueHeroi == defesaOponente) {
				decremento(); // Na energia do proprio heroi
				oponente.decremento();
			} else if (ataqueHeroi > defesaOponente) {
				incremento(); // Na energia do proprio heroi
				oponente.decremento();
			} else { // Quando o oponente vence
				decremento(); // Na energia do proprio heroi
				oponente.incremento();
			}
		}
		
		//Turno heroi defende
		if(!oponente.estaMorto()){
			if (defesaHeroi == ataqueOponente) {
				decremento(); // Na energia do proprio heroi
				oponente.decremento();
			} else if (defesaHeroi > ataqueOponente) {
				incremento(); // Na energia do proprio heroi
				oponente.decremento();
			} else { // Quando o oponente vence
				decremento(); // Na energia do proprio heroi
				oponente.incremento();
			}
		}
	}
	
	public void imprimir() {
		System.out.println("#####################");
		System.out.println("# Dados do Heroi");
		super.imprimir();
		System.out.println("# Itens Ataque: " + ataque.getAtaque());
        System.out.println("# Itens Defesa: " + itensDefesa.getDefesa());
        System.out.println("#####################");
	}
	
	public int pegaEnergiaMaxima() {
		return energiaMaxima;
	}
}
