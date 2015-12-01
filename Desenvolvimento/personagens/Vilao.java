package personagens; 


public class Vilao extends Personagem {
	private static final int energiaMaxima = 30;

	public Vilao(String nome, int energia, int ataque, int defesa, int quantidadeDeMoedas) {
		super(nome, energia,quantidadeDeMoedas);
                super.ataque = ataque;
                super.defesa = defesa;
	}
	
	public int pegaEnergiaMaxima() {
            
		return energiaMaxima;
	}
	
	public void imprimir() {
		System.out.println("#####################");
		System.out.println("# Informações do Vilão");
		super.imprimir();
	}
}
