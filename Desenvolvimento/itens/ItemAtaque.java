package itens;

/**
 * Escreva a descrição da classe ItemAtaque aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ItemAtaque extends Item{
      protected int rapidez; //**atributo rapidez quando rapido sera a arma*/
      protected int forca;   //**atributo que define o quanto forte sera a arma*/
      protected int valueatack;
      protected ItemAtaque(int rapidez , int forca , String nome ,String descricao){
        super(nome,descricao,1000000);//**o valor do peso eh para nao poder carregar na pasta*/
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
       protected void setItemAtaque(int rapidez , int forca , String nome ,String descricao,int peso){
           super.setItem(nome,descricao,peso);
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
        
    @Override
    public int getenergy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvalue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvaluedefense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getvalueatack() {
        return(this.valueatack);
    }
        /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    }

    
    

