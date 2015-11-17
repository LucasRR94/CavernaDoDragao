
/**
 * Escreva a descrição da classe ItemAtaque aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ItemAtaque extends Item
{
      private int rapidez; //**atributo rapidez quando rapido sera a arma*/
      private int forca;   //**atributo que define o quanto forte sera a arma*/
      
      protected ItemAtaque(int rapidez , int forca , String nome ,String descricao){
        super(nome,descricao);
        if(rapidez < 1){
            this.rapidez = 1;
        }
        if(rapidez > 10){
            this.rapidez=10;
        }
        if(forca < 1){
            this.forca =1;
        }
        if(forca > 10){
            this.forca = 10;
        }
       
        if(forca >= 1 && forca <= 10){
            this.rapidez = rapidez;
            this.forca = forca;
        }
        
       }
       
       protected void  deixaMaisRapido(int rapidez){
          if(this.rapidez >= 10){
             
            }
          else{ 
              this.rapidez+=rapidez;
              if(this.rapidez > 10){
                  this.rapidez = 10;
                }
            }
           
       }
       
       protected void deixaMaisForte(int forca){
           if(this.forca < 10){
               this.forca += forca;
               if(this.forca > 10){
                   this.forca = 10;
                }
           }
           else{
            
            }
        }
        protected int getrapidez(){
            return(this.rapidez);
        }
        protected int getforca(){
            return(this.forca);
        }
        /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    }

    
    

