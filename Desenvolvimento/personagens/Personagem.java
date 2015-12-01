package personagens; 

import java.util.Random;

public abstract class Personagem {
    private String nome;
    private int energia;
    protected int ataque; //**atributo que define quanto de ataque o personagem tem*/
    protected int defesa; //**atributo que define quanto de defesa o personagem tem*/
    private int quantidadeDeMoedas;
    private static Random dado = new Random();
    
    public Personagem(String nome, int energia,int quantidadeDeMoedas) {
        this.nome = nome;
        this.energia = energia;
        this.quantidadeDeMoedas = quantidadeDeMoedas;
    }
    public String pegaNome() {
        return nome;
    }
    
    public int pegaEnergia() {
        return energia;
    }
    
    public void aumentaMoedas(int quantidade){
    	quantidadeDeMoedas += quantidade;
    }
    
    public int getMoedas(){
    	return quantidadeDeMoedas;
    }
    
    public boolean estaMorto() {
        if (energia == 0)
            return true;
        else
            return false;
    }
    
    public abstract int pegaEnergiaMaxima();
    
    public void incremento() {
        if (energia < pegaEnergiaMaxima())
            energia++;
    }
    
    public void decremento() {
        if (energia > 0)
            energia--;
        if (energia == 0)
            System.out.println("\n# " + nome + " esta morto!\n");
    }
    
    public int sorte(int valorMaximo) {
        return dado.nextInt(valorMaximo) + 1;
    }
    
    public void imprimir() {
        System.out.println("#####################");
        System.out.println("# Nome: " + nome);
        System.out.println("# Energia: " + energia);
        System.out.println("# Ataque: " + ataque);
        System.out.println("# Defesa: " + defesa);
        System.out.println("#####################");
    }
}
