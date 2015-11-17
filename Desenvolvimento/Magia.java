
/**
 * Escreva a descrição da classe Magia aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Magia extends Item
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int validadeMagia;
    private int fase;
    /**
     * COnstrutor para objetos da classe Magia
     */
    public Magia(String nome, String descricao)
    {
        // inicializa variáveis de instância
        super(nome,descricao); 
        validadeMagia = 10;
        fase = 1;
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
        
        return(this.validadeMagia);
        
    }
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
   
}
