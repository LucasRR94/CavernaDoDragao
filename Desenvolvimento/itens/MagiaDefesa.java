package itens;

/**
 * Escreva a descrição da classe MagiaDefesa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MagiaDefesa extends Magia
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    /**
     * COnstrutor para objetos da classe MagiaAtaque
     */
    public MagiaDefesa(String nome, String descricao,int capacidadeDeDefesa)
    {
        // inicializa variáveis de instância
        super(nome,descricao); //**manda para o construtor pai*/
        int capacidade;
        capacidade = capacidadeDeDefesa;
        if(capacidadeDeDefesa > 10)
           capacidade = 10;
        if(capacidadeDeDefesa < 1)
           capacidade = 1;
        super.valuedefense = capacidade;
    }
    public void  setMagiaDefesa(String nome, String descricao,int capacidadeDeDefesa){
        super.setMagia(nome, descricao);
        int capacidade;
        capacidade = capacidadeDeDefesa;
        if(capacidadeDeDefesa>10){
            capacidade = 10;
        }
        if(capacidadeDeDefesa<1){
            capacidade = 1;
        }
        super.valuedefense = capacidade;
    }
    
    public int Defende(){
        super.validadeMagia();
        int validade = super.getvalidadeMagia();
        int capacidadeDeDefesa = validade * super.valuedefense;
        if(capacidadeDeDefesa > 10){
            capacidadeDeDefesa = 10;
        }
        if(capacidadeDeDefesa < 1){
            capacidadeDeDefesa = 1;
        }
        super.valuedefense = capacidadeDeDefesa;
        return(capacidadeDeDefesa);
    }
}
