 

import java.util.Random;

public abstract class Personagem {
    private String nome;
    private int energia;
    private int ataque; //**atributo que define quanto de ataque o personagem tem*/
    private int defesa; //**atributo que define quanto de defesa o personagem tem*/
    private static Random dado = new Random();
    
    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }
    
    public void setataque(int ataque){ //**metodo que seta o valor do ataque do personagem no minimo 1 , e maximo 10/ 
        if(this.ataque < 0){
            this.ataque = 1;
        }
        if(this.ataque > 10){
            this.ataque = 10;
        }
        else{
            this.ataque = ataque;
        }
    }
    public int getataque(){
        return(this.ataque);
    }
    public void decrementaataque(){
        if(this.ataque==0){
            //desabilita arma
        }
        else{
            this.ataque--;
        }
   }
    public void incremetaataque(){
        if(this.ataque >= 10){
            
            this.ataque = 10;
            
        }
        else{
            
            this.ataque++;
        }
        
    }
    public String pegaNome() {
        return nome;
    }
    
    public int pegaEnergia() {
        return energia;
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
        System.out.println("#####################");
    }
}
