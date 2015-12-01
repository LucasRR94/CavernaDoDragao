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
public class Defensiva {
    MagiaDefesa magic;
    Defesa escudo;
    public Defensiva(){
        magic = new MagiaDefesa("","",0);//String nome, String descricao,int capacidadeDeAtaque
        escudo = new Defesa(0,0,"",""); //int rapidez , int forca , String nome ,String descricao 
    }
    public void  setDispositivo(Defesa escudo1){
        escudo = escudo1;
    }
    public void setMagic(MagiaDefesa magiaDefesa){
        magic = magiaDefesa;
    }
    public int getDefesa(){
    	return (magic.getvaluedefense()+escudo.getvaluedefense())/2;
    }
    
}
