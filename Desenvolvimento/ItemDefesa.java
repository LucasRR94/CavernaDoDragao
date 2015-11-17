
/**
 * Escreva a descrição da classe ItemDefesa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ItemDefesa extends Item
{
    private int tamanho; //**definira a tamanho area de protecao do itemDefesa*/
    private int peso;    //**definira o peso total do itemDefesa*/

    protected ItemDefesa(int tamanho, int peso,String nome,String descricao){
        // inicializa variáveis de instância
        super(nome,descricao);
        if(tamanho < 1){
            this.tamanho = 1;
        }
        if(tamanho > 10){
            this.tamanho=10;
        }
        if(peso < 1){
            this.peso =1;
        }
        if(peso > 10){
            this.peso = 10;
        }
       
        if(tamanho >= 1 && tamanho <= 10){
            this.tamanho = tamanho;
            
        }
        if(peso >= 1 && peso <= 10){
             this.peso=peso;
        }
           
    }
    protected void DeixaMaisLeve(int peso){
        if(this.peso < 1){
            this.peso -=peso;
            if(this.peso<1){
                this.peso = 1;
            }
        }
        
    }
    protected void aumentaAreaDeProtecao(int tamanho){
        if(this.tamanho < 11){
            this.tamanho += tamanho;
            if(this.tamanho > 10){
                this.tamanho = 10;
            }
        }
        
    }
    protected void deixaMaisPesado(int peso){
        if(this.peso < 10){
            this.peso+=peso;
            if(this.peso > 10){
                this.peso = 10;
            }
        }
    }
    protected void diminueAreaDeProtecao(int tamanho){
        if(this.tamanho > 1){
            this.tamanho -=tamanho;
            if(this.tamanho < 1){
                this.tamanho = 1;
            }
        }
    }
    protected int gettamanho(){
        return(this.tamanho);
    }
    protected int getpeso(){
        return(this.peso);
    }
}
