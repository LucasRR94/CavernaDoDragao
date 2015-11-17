
/**
 * Escreva a descrição da classe MagiaDefesa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MagiaDefesa extends Magia
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int capacidadeDeDefesa;
    
    /**
     * COnstrutor para objetos da classe MagiaAtaque
     */
    public MagiaDefesa(String nome, String descricao,int capacidadeDeDefesa)
    {
        // inicializa variáveis de instância
        super(nome,descricao); //**manda para o construtor pai*/
        this.capacidadeDeDefesa = capacidadeDeDefesa;
        
    }
    public int Defende(){
        super.validadeMagia();
        int validade = super.getvalidadeMagia();
        int capacidadeDeDefesa = validade * this.capacidadeDeDefesa;
        return(capacidadeDeDefesa);
    }
}
