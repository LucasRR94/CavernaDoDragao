/**
 * Escreva a descrição da classe MagiaAtaque aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MagiaAtaque extends Magia
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int capacidadeDeAtaque;
    
    /**
     * COnstrutor para objetos da classe MagiaAtaque
     */
    public MagiaAtaque(String nome, String descricao,int capacidadeDeAtaque)
    {
        // inicializa variáveis de instância
        super(nome,descricao); //**manda para o construtor pai*/
        this.capacidadeDeAtaque = capacidadeDeAtaque;
        
    }
    public int ataque(){
        super.validadeMagia();
        int validade = super.getvalidadeMagia();
        int capacidadeDeAtaque = validade * this.capacidadeDeAtaque;
        return(capacidadeDeAtaque);
    }
    
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
