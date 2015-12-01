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
public class Alimento extends Item{
    private int acrescimoenergia;
    private int peso;
    
    public Alimento(String nome, String descricao,int acrescimoenergia,int peso) {
        super(nome, descricao,peso);
    }
    public int getAlimento(){
        int x = this.acrescimoenergia;
        this.acrescimoenergia = 0;
        this.peso = 0;
        return(x);
    }
    public int getPeso(){
        return(this.peso);
    }
    @Override
    public int getenergy(){
        return(this.acrescimoenergia);
    }

    @Override
    public int getvalue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvaluedefense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvalueatack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
