 package itens;
import java.util.Random;

/**
 * Escreva a descrição da classe Defesa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Defesa extends ItemDefesa{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    /**
     * COnstrutor para objetos da classe Defesa
     */
    public Defesa(int tamanho, int peso,String nome,String descricao)
    {
        // inicializa variáveis de instância
        super(tamanho,peso,nome,descricao);
        calculacapacidadeDeDefesa();
    }
    private void calculacapacidadeDeDefesa(){
    	int capacidadeDeDefesa;
        int x = super.getpeso();
        int y = super.gettamanho();
        int l = (x+y)/2;
        capacidadeDeDefesa = l;
        if(l<1){
            capacidadeDeDefesa = 1;
        }
        if(l>10){
            capacidadeDeDefesa = 10;
        }
        super.valuedefense = capacidadeDeDefesa;
    }
    protected void setDefesa(int tamanho, int peso,String nome,String descricao){
        super.setItemDefesa(tamanho, peso, nome, descricao);
        calculacapacidadeDeDefesa();
    }
    protected void Desgaste(int capacidadeDeAtaqueInimigo,int capacidadeDeDefesaInimigo){
        Random r =  new Random();
        int capacidadeDeDefesa = super.getvaluedefense();
        int p = r.nextInt(10) + 1;
        int x = (capacidadeDeAtaqueInimigo + capacidadeDeDefesaInimigo)/p;
        capacidadeDeDefesa -= x;
        super.DeixaMaisLeve(x);
        super.diminueAreaDeProtecao(x);
        calculacapacidadeDeDefesa();
        if(capacidadeDeDefesa >10){
            capacidadeDeDefesa = 10;
        }
        if(capacidadeDeDefesa < 1){
            capacidadeDeDefesa = 1;
        }
        super.valuedefense = capacidadeDeDefesa;
    }
    protected void ferreiro(int recuperacao){
    	int capacidadeDeDefesa = super.getvaluedefense();
        super.aumentaAreaDeProtecao(recuperacao);
        super.deixaMaisPesado(recuperacao);
        calculacapacidadeDeDefesa();
        if(capacidadeDeDefesa > 10){
            capacidadeDeDefesa = 10;
        }
    }
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
