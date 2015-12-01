package itens;
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
    
    /**
     * COnstrutor para objetos da classe Arma
     */
    public Arma(int rapidez , int forca , String nome ,String descricao)
    {
        super(rapidez,forca ,nome ,descricao);
        calculacapacidadeDeAtaque();
    }
    protected void setArma(int rapidez , int forca , String nome ,String descricao){
        this.setItemAtaque(rapidez,forca,nome,descricao,0);
        calculacapacidadeDeAtaque();
        
    }
    protected void calculacapacidadeDeAtaque(){
        int x = super.getforca();
        int y = super.getrapidez();
        int l = (x+y)/2;
        int capacidadeDeAtaque = l;
        if(l > 10){
            capacidadeDeAtaque =10;
        }
        if(l < 1){
            capacidadeDeAtaque = 1;
        }
        super.valueatack = capacidadeDeAtaque;
    }
    
    protected void Desgaste(int capacidadeDeAtaqueInimigo,int capacidadeDeDefesaInimigo){
        Random r =  new Random();
        int capacidadeDeAtaque = super.getvalueatack();
        int p = r.nextInt(10) + 1;
        int x = (capacidadeDeAtaqueInimigo + capacidadeDeDefesaInimigo)/p;
        capacidadeDeAtaque -= x;
        super.valueatack = capacidadeDeAtaque;
        
    }

    
    
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
