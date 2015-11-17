import java.util.Random;
/**
 * Escreva a descrição da classe Defesa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Defesa extends ItemDefesa{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int  capacidadeDeDefesa = 0;

    /**
     * COnstrutor para objetos da classe Defesa
     */
    protected Defesa(int tamanho, int peso,String nome,String descricao)
    {
        // inicializa variáveis de instância
        super(tamanho,peso,nome,descricao);
        calculacapacidadeDeDefesa();
    }
    private void calculacapacidadeDeDefesa(){
        int x = super.getpeso();
        int y = super.gettamanho();
        int l = (x+y)/2;
        this.capacidadeDeDefesa = l;
    }
    
    protected void Desgaste(int capacidadeDeAtaqueInimigo,int capacidadeDeDefesaInimigo){
        Random r =  new Random();
        int p = r.nextInt(10) + 1;
        int x = (capacidadeDeAtaqueInimigo + capacidadeDeDefesaInimigo)/p;
        this.capacidadeDeDefesa -= x;
        
    }
    protected void ferreiro(int recuperacao){
        this.capacidadeDeDefesa+=recuperacao;
    }
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
