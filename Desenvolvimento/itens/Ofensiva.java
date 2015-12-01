/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens;

/**
 *
 * @author lucas
 */
public class Ofensiva{
    private MagiaAtaque magic;
    private Arma arma;
    
    public Ofensiva(){
        magic = new MagiaAtaque("","",0);//String nome, String descricao,int capacidadeDeAtaque
        arma = new Arma(0,0,"",""); //int rapidez , int forca , String nome ,String descricao 
    }
    public void  setDispositivo(Arma arma1){
        arma = arma1;
    }
    public void setMagic(MagiaAtaque magiaAtaque){
    	magic = magiaAtaque;
    }
    public int getAtaque(){
    	return (magic.getvalueatack()+arma.getvalueatack())/2;
    }
}
