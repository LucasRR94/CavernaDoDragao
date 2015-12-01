package itens;

/**
 * Escreva a descrição da classe MagiaAtaque aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MagiaAtaque extends Magia
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    /**
     * COnstrutor para objetos da classe MagiaAtaque
     */
    public MagiaAtaque(String nome, String descricao,int capacidadeDeAtaque)
    {
        // inicializa variáveis de instância
        super(nome,descricao); //**manda para o construtor pai*/
        int capacidade = capacidadeDeAtaque;
        if(capacidade<1){
            capacidade = 1;
        }
        if(capacidade > 10){
            capacidade = 10;
        }
        super.valueatack = capacidade;
    }
    public void  setMagiaAtaque(String nome, String descricao,int capacidadeDeAtaque){
        super.setMagia(nome, descricao);
        int capacidade = capacidadeDeAtaque;
        if(capacidade<1){
            capacidade = 1;
        }
        if(capacidade > 10){
            capacidade = 10;
        }
        super.valueatack = capacidade;
        
    }
    public int ataque(){
        super.validadeMagia();
        int validade = super.getvalidadeMagia();
        int capacidadeDeAtaque = (validade * super.getvalueatack());
        if(capacidadeDeAtaque > 10){
            capacidadeDeAtaque = 10;
        }
        if(capacidadeDeAtaque < 1){
            capacidadeDeAtaque = 1;
        }
        return(capacidadeDeAtaque);
    }
    
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
