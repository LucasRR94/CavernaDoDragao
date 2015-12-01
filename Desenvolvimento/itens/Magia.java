package itens;

/**
 * Escreva a descrição da classe Magia aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Magia extends Item
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private   int validadeMagia;
    private   int fase;
    protected int valuedefense;
    protected int valueatack;
    /**
     * COnstrutor para objetos da classe Magia
     */
    public Magia(String nome, String descricao)
    {
        // inicializa variáveis de instância
        super(nome,descricao,0); 
        validadeMagia = 10;
        fase = 1;
    }
    public String getNome(){
        return(this.nome);
    }
    public String getDescricao(){
        return(this.descricao);
    }
    public void setMagia(String nome, String descricao){
        super.setItem(nome, descricao,0);
        this.fase = 1;
        this.validadeMagia = 10;
    }
    public void validadeMagia(){ // 5 niveis eh possivel usar magia 3 vezes antes dela desaparecer
        fase++;
        if(fase==1){
            
        }
        if(fase==2){
            this.validadeMagia = 5;
        }
        if(fase==3){
            this.validadeMagia = 3;
        }
        if(fase==4){
            this.validadeMagia = 0;
        }
    }
    public int getvalidadeMagia(){
        validadeMagia();
        return(this.validadeMagia);
        
    }

    @Override
    public int getenergy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvalue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getvaluedefense() {
        return(this.valuedefense);
    }
    @Override
    public int getvalueatack() {
        return(this.valueatack);
    }
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
   
}
