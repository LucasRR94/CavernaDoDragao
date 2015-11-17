 

import java.util.HashMap;
import java.util.Map;
import itens.*;

public class Heroi extends Personagem {
	private int energiaMaxima;
	private int limiteDePeso;
	private Map <String, Item> mochila;//**mochila carregara armas,que nao esteja usando , alem de magias*/
	
	public Heroi(String nome,int ataque,int defesa, int energia, int energiaMaxima, int limiteDePeso) {
		super(nome,ataque,defesa,energia); //**ao criar o heroio ja possuira armas e estas daram o valor do ataque e defesa*/
		this.energiaMaxima = energiaMaxima;
		this.limiteDePeso = limiteDePeso;
		mochila = new HashMap();
	}
	
	private int calcularPeso() {
		int pesoTotal = 0;
		for(Item item : mochila.values()) {
			pesoTotal += item.pegaPeso();
		}
		return pesoTotal;
	}
	
	public void inserirItem(Item item) {
		if (calcularPeso() + item.pegaPeso() <= limiteDePeso) {
			mochila.put(item.pegaNome(), item);
		} else {
			System.out.println("\n# O " + pegaNome() + " nao pode carregar mais itens na mochila!\n");
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
	
	public void alimentar() {
		incremento();
		incremento();
	}
	
	public void lutar(Personagem oponente) {
		int dadoDoHeroi = sorte(6);
		int dadoDoOponente = sorte(6);
		
		if (dadoDoHeroi == dadoDoOponente) {
			decremento(); // Na energia do proprio heroi
			oponente.decremento();
		} else if (dadoDoHeroi > dadoDoOponente) {
			incremento(); // Na energia do proprio heroi
			oponente.decremento();
		} else { // Quando o oponente vence
			decremento(); // Na energia do proprio heroi
			oponente.incremento();
		}
	}
	
	public void imprimir() {
		System.out.println("#####################");
		System.out.println("# Dados do Heroi");
		super.imprimir();
	}
	
	public int pegaEnergiaMaxima() {
		return energiaMaxima;
	}
}
