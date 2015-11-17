import java.util.Random;
/**
 * Escreva a descrição da classe Arma aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Arma extends ItemAtaque
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int capacidadeDeAtaque;
    
    /**
     * COnstrutor para objetos da classe Arma
     */
    protected Arma(int rapidez , int forca , String nome ,String descricao)
    {
        // inicializa variáveis de instância
        super(rapidez,forca ,nome ,descricao);
        
    }
    
    protected void calculacapacidadeDeAtaque(){
        int x = super.getforca();
        int y = super.getrapidez();
        int l = (x+y)/2;
        this.capacidadeDeAtaque = l;
    }
    
    protected void Desgaste(int capacidadeDeAtaqueInimigo,int capacidadeDeDefesaInimigo){
        Random r =  new Random();
        int p = r.nextInt(10) + 1;
        int x = (capacidadeDeAtaqueInimigo + capacidadeDeDefesaInimigo)/p;
        this.capacidadeDeAtaque -= x;
        
    }
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
