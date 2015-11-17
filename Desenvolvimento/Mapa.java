
/**
 * Escreva a descrição da classe Mapa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Mapa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Room current;

    /**
     * Construtor para objetos da classe Mapa
     */
    public Mapa()
    {
        // inicializa variáveis de instância
        createRooms();    
    }
        
    private void createRooms()
    {
        //-------------------------------------------------------------------------------------------------------
        Room atracagemDeBarcoIlha1[] =new Room[6] ; //ilha possue 6 entradas que levam a 2 clareras 
        Room atracagemDeBarcoIlha2[] =new Room[6] ; //ilha possue 6 entradas que levam a 2 clareras 
        Room atracagemDeBarcoIlha3[] =new Room[6] ; //ilha possue 6 entradas que levam a 2 clareras 
        Room clareraNoMeioDaIlha[] = new Room[6];   //em cada ilha possuem duas clareras que levam a uma outra clarera
        Room clarerafinaldaIlha[]  = new Room[6];    //clarera que leva ao final da ilha secundaria e ao inicio da ilha central
        Room clarerainicialilhacentral[]= new Room[6];//primeira clarera que leva ao chefe e a sala final
        Room finalroom;//sala final
        //--------------------------------------------------------------------------------------------------------
        
        Room water;//fase inicial onde o barco está na agua ele possue 18 entradas possiveis
        
        Room ilha1; 
        Room ilha2;
        Room ilha3;
        //-Pre-Begin---------------------------------------------------------------------------------------------------------
        water = new Room("você está atualmente em um barco, observando um conjunto de tres ilhas que se juntam em uma");
        //Begin--------------------------------------------------------------------------------------------------------
        ilha1 = new Room("Você está na ilha sul atualmente.");
        ilha2 = new Room("Você está na ilha leste atualmente.");
        ilha3 = new Room("Você está na ilha oeste atualmente.");
        //-Nivel-1--------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[0].changeDescription("você está mais oeste da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[1].changeDescription("você está mais central oeste da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[2].changeDescription("você está mais sul da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[3].changeDescription("você está mais sul da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[4].changeDescription("você está mais centro leste da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[5].changeDescription("você está mais leste da ilha sul em uma clareira");
        //-Nivel-1--------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[0].changeDescription("você está mais oeste da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[1].changeDescription("você está mais central oeste da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[2].changeDescription("você está mais sul da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[3].changeDescription("você está mais sul da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[4].changeDescription("você está mais centro leste da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[5].changeDescription("você está mais leste da ilha leste em uma clareira");
        //-Nivel-1---------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[0].changeDescription("você está mais oeste da ilha leste em uma clareira");
        atracagemDeBarcoIlha3[1].changeDescription("você está mais central oeste da ilha leste em uma clareira");
        atracagemDeBarcoIlha3[2].changeDescription("você está mais sul da ilha leste em uma clareira");
        atracagemDeBarcoIlha3[3].changeDescription("você está mais sul da ilha leste em uma clareira");
        atracagemDeBarcoIlha3[4].changeDescription("você está mais centro leste da ilha leste em uma clareira");
        atracagemDeBarcoIlha3[5].changeDescription("você está mais leste da ilha leste em uma clareira");
        //-Nivel-2--------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[0].changeDescription("Você passou pelo primeiro nivel agora você está em uma clareira mais central da ilha sul");   
        clareraNoMeioDaIlha[1].changeDescription("Você passou pelo primeiro nivel agora você está em uma clareira mais central da ilha sul");
        clareraNoMeioDaIlha[2].changeDescription("Você passou pelo primeiro nivel agora você está em uma clareira mais central da ilha leste");
        clareraNoMeioDaIlha[3].changeDescription("Você passou pelo primeiro nivel agora você está em uma clareira mais central da ilha leste");
        clareraNoMeioDaIlha[4].changeDescription("Você passou pelo primeiro nivel agora você está em uma clareira mais central da ilha oeste");
        clareraNoMeioDaIlha[5].changeDescription("Você passou pelo primeiro nivel agora você está em uma clareira mais central da ilha oeste");
        //-Nivel-3--------------------------------------------------------------------------------------------------------
        clarerafinaldaIlha[0].changeDescription("Você passou pelo segundo nivel agora você está na clareira final da ilha sul");    
        clarerafinaldaIlha[1].changeDescription("Você passou pelo segundo nivel agora você está na clareira final da ilha leste");    
        clarerafinaldaIlha[2].changeDescription("Você passou pelo segundo nivel agora você está na clareira final da ilha oeste");    
        //-Nivel-4---------------------------------------------------------------------------------------------------------
        clarerainicialilhacentral[0].changeDescription("Você passou pelo terceiro nivel agora você está na clareira inicial da ilha central misteriosa");
        clarerainicialilhacentral[1].changeDescription("Você passou pelo terceiro nivel agora você está na clareira inicial da ilha central misteriosa");
        clarerainicialilhacentral[2].changeDescription("Você passou pelo terceiro nivel agora você está na clareira inicial da ilha central misteriosa");
        //-Nivel-5------------------------------------------------------------------------------------------------------
        finalroom = new Room("Voce passou pelo quarto nivel e agora você está na clareira central da ilha, no meio da ilha central misteriosa");
        //----------------------------------------------------------------------------------------------------------------
        
        //Initialise room Exits-------------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------
        water.setExit("ilha sul",ilha1);
        water.setExit("ilha leste",ilha2);
        water.setExit("ilha oeste",ilha3);
        //-----------------------------------------------------------------------------------------------------------------
        //ILHA 1
        //-----------------------------------------------------------------------------------------------------------------
        ilha1.setExit("clareira mais a oeste",atracagemDeBarcoIlha1[0]);
        ilha1.setExit("clareira central oeste",atracagemDeBarcoIlha1[1]);
        ilha1.setExit("clareira sul mais a esquerda",atracagemDeBarcoIlha1[2]);
        ilha1.setExit("clareira sul mais a direita",atracagemDeBarcoIlha1[3]);
        ilha1.setExit("clareira central leste",atracagemDeBarcoIlha1[4]);
        ilha1.setExit("clareira mais a leste",atracagemDeBarcoIlha1[5]);
        //-----------------------------------------------------------------------------------------------------------------
        ilha1.setExit("voltar ao barco",water); //VOLTA
        //-----------------------------------------------------------------------------------------------------------------
        //ILHA 2
        //-----------------------------------------------------------------------------------------------------------------
        ilha2.setExit("clareira mais a oeste",atracagemDeBarcoIlha2[0]);
        ilha2.setExit("clareira central oeste",atracagemDeBarcoIlha2[1]);
        ilha2.setExit("clareira sul mais a esquerda",atracagemDeBarcoIlha2[2]);
        ilha2.setExit("clareira sul mais a direita",atracagemDeBarcoIlha2[3]);
        ilha2.setExit("clareira central leste",atracagemDeBarcoIlha2[4]);
        ilha2.setExit("clareira mais a leste",atracagemDeBarcoIlha2[5]);
        //-----------------------------------------------------------------------------------------------------------------
        ilha2.setExit("voltar ao barco",water); //VOLTA 
        //-----------------------------------------------------------------------------------------------------------------
        //ILHA 3
        //-----------------------------------------------------------------------------------------------------------------
        ilha3.setExit("clareira mais a oeste",atracagemDeBarcoIlha3[0]);
        ilha3.setExit("clareira central oeste",atracagemDeBarcoIlha3[1]);
        ilha3.setExit("clareira sul mais a esquerda",atracagemDeBarcoIlha3[2]);
        ilha3.setExit("clareira sul mais a direita",atracagemDeBarcoIlha3[3]);
        ilha3.setExit("clareira central leste",atracagemDeBarcoIlha3[4]);
        ilha3.setExit("clareira mais a leste",atracagemDeBarcoIlha3[5]);
        //-----------------------------------------------------------------------------------------------------------------
        ilha3.setExit("voltar ao barco",water); //volta
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[0].setExit("clareira mais central da ilha sul",clareraNoMeioDaIlha[0]);
        atracagemDeBarcoIlha1[0].setExit("volta ao inicio da ilha",ilha1);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[1].setExit("clareira mais central da ilha sul",clareraNoMeioDaIlha[0]);
        atracagemDeBarcoIlha1[1].setExit("volta ao inicio da ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[2].setExit("clareira mais central da ilha sul",clareraNoMeioDaIlha[0]);
        atracagemDeBarcoIlha1[2].setExit("volta ao inicio da ilha",ilha1);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[3].setExit("clareira mais central da ilha sul",clareraNoMeioDaIlha[1]);
        atracagemDeBarcoIlha1[3].setExit("volta ao inicio da ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[4].setExit("clareira mais central da ilha sul",clareraNoMeioDaIlha[1]);
        atracagemDeBarcoIlha1[4].setExit("volta ao inicio da ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[5].setExit("clareira mais central da ilha sul",clareraNoMeioDaIlha[1]);
        atracagemDeBarcoIlha1[5].setExit("volta ao inicio da ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[0].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[2]);
        atracagemDeBarcoIlha2[0].setExit("volta ao inicio da ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[1].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[2]);
        atracagemDeBarcoIlha2[1].setExit("volta ao inicio da ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[2].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[2]);
        atracagemDeBarcoIlha2[2].setExit("volta ao inicio da ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[3].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[3]);
        atracagemDeBarcoIlha2[3].setExit("volta ao inicio da ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[4].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[3]);
        atracagemDeBarcoIlha2[4].setExit("volta ao inicio da ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[5].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[3]);
        atracagemDeBarcoIlha2[5].setExit("volta ao inicio da ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[0].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[4]);
        atracagemDeBarcoIlha3[0].setExit("volta ao inicio da ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[1].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[4]);
        atracagemDeBarcoIlha3[1].setExit("volta ao inicio da ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[2].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[4]);
        atracagemDeBarcoIlha3[2].setExit("volta ao inicio da ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[3].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[5]);
        atracagemDeBarcoIlha3[3].setExit("volta ao inicio da ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[4].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[5]);
        atracagemDeBarcoIlha3[4].setExit("volta ao inicio da ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[5].setExit("clareira mais central da ilha leste",clareraNoMeioDaIlha[5]);
        atracagemDeBarcoIlha3[5].setExit("volta ao inicio da ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        //volta da clareira central
        //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[0].setExit("voltar a clareira inicial da ilha sul , mais a oeste",atracagemDeBarcoIlha1[0]);
        clareraNoMeioDaIlha[0].setExit("voltar a clareira inicial da ilha sul , mais a central oeste",atracagemDeBarcoIlha1[1]);
        clareraNoMeioDaIlha[0].setExit("voltar a clareira inicial da ilha sul , mais a sul esquerda",atracagemDeBarcoIlha1[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[1].setExit("voltar a clareira inicial da ilha sul , mais a sul direita",atracagemDeBarcoIlha1[3]);
        clareraNoMeioDaIlha[1].setExit("voltar a clareira inicial da ilha sul , mais a central leste",atracagemDeBarcoIlha1[4]);
        clareraNoMeioDaIlha[1].setExit("voltar a clareira inicial da ilha sul , mais a leste",atracagemDeBarcoIlha1[5]);
        //------------------------------------------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[2].setExit("voltar a clareira inicial da ilha leste , mais a oeste",atracagemDeBarcoIlha2[0]);
        clareraNoMeioDaIlha[2].setExit("voltar a clareira inicial da ilha leste , mais a central oeste",atracagemDeBarcoIlha2[1]);
        clareraNoMeioDaIlha[2].setExit("voltar a clareira inicial da ilha leste , mais a sul esquerda",atracagemDeBarcoIlha2[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[3].setExit("voltar a clareira inicial da ilha leste , mais a sul direita",atracagemDeBarcoIlha2[3]);
        clareraNoMeioDaIlha[3].setExit("voltar a clareira inicial da ilha leste , mais a central leste",atracagemDeBarcoIlha2[4]);
        clareraNoMeioDaIlha[3].setExit("voltar a clareira inicial da ilha leste , mais a leste",atracagemDeBarcoIlha2[5]);
        //------------------------------------------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[4].setExit("voltar a clareira inicial da ilha leste , mais a oeste",atracagemDeBarcoIlha3[0]);
        clareraNoMeioDaIlha[4].setExit("voltar a clareira inicial da ilha leste , mais a central oeste",atracagemDeBarcoIlha3[1]);
        clareraNoMeioDaIlha[4].setExit("voltar a clareira inicial da ilha leste , mais a sul esquerda",atracagemDeBarcoIlha3[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[5].setExit("voltar a clareira inicial da ilha leste , mais a sul direita",atracagemDeBarcoIlha3[3]);
        clareraNoMeioDaIlha[5].setExit("voltar a clareira inicial da ilha leste , mais a central leste",atracagemDeBarcoIlha3[4]);
        clareraNoMeioDaIlha[5].setExit("voltar a clareira inicial da ilha leste , mais a leste",atracagemDeBarcoIlha3[5]);
        //------------------------------------------------------------------------------------------------------------------
        
        //ida ao final da ilha
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[0].setExit("ir para o final da ilha",clarerafinaldaIlha[0]);
        clareraNoMeioDaIlha[1].setExit("ir para o final da ilha",clarerafinaldaIlha[0]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[2].setExit("ir para o final da ilha",clarerafinaldaIlha[1]);
        clareraNoMeioDaIlha[3].setExit("ir para o final da ilha",clarerafinaldaIlha[1]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[4].setExit("ir para o final da ilha",clarerafinaldaIlha[2]);
        clareraNoMeioDaIlha[5].setExit("ir para o final da ilha",clarerafinaldaIlha[2]);
        //------------------------------------------------------------------------------------------------------------------
        //Volta da saida da ilha
        //------------------------------------------------------------------------------------------------------------------
        clarerafinaldaIlha[0].setExit("voltar a clareira central , mais a esquerda ilha sul",clarerafinaldaIlha[0]);
        clarerafinaldaIlha[0].setExit("voltar a clareira central ,mais a direta , ilha sul",clarerafinaldaIlha[1]);
        //------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------
        clarerafinaldaIlha[1].setExit("voltar a clareira central , mais a esquerda ilha leste",clarerafinaldaIlha[2]);
        clarerafinaldaIlha[1].setExit("voltar a clareira central ,mais a direita ilha leste",clarerafinaldaIlha[3]);
        //------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------
        clarerafinaldaIlha[2].setExit("voltar a clareira central , mais a esquerda ilha leste",clarerafinaldaIlha[4]);
        clarerafinaldaIlha[2].setExit("voltar a clareira central ,mais a direita ilha leste",clarerafinaldaIlha[5]);
        //------------------------------------------------------------------------------------------------------------------
        //ir para clareira inicial da ilha final
        //------------------------------------------------------------------------------------------------------------------
        clarerafinaldaIlha[0].setExit("Ir para clareira de inicio da ilha final",clarerainicialilhacentral[0]);
        clarerafinaldaIlha[1].setExit("Ir para clareira de inicio da ilha final",clarerainicialilhacentral[1]);
        clarerafinaldaIlha[2].setExit("Ir para clareira de inicio da ilha final",clarerainicialilhacentral[2]);
        //------------------------------------------------------------------------------------------------------------------
        //volta para clareira final da ilha 
        clarerainicialilhacentral[0].setExit("volta para clareira final da ilha sul",clarerafinaldaIlha[0]);
        clarerainicialilhacentral[1].setExit("volta para clareira final da ilha leste",clarerafinaldaIlha[1]);
        clarerainicialilhacentral[2].setExit("volta para clareira final da ilha oeste",clarerafinaldaIlha[2]);
        //------------------------------------------------------------------------------------------------------------------
        //Indo para clareira final da ilha central
        //------------------------------------------------------------------------------------------------------------------
        clarerafinaldaIlha[0].setExit("ir para a clareira central da ilha principal",finalroom);
        clarerafinaldaIlha[1].setExit("ir para a clareira central da ilha principal",finalroom);
        clarerafinaldaIlha[2].setExit("ir para a clareira central da ilha principal",finalroom);
        //------------------------------------------------------------------------------------------------------------------
        
        //Volta da clareira final
        //-------------------------------------------------------------------------------------------------------------------
        finalroom.setExit("voltar para clareira inicial mais a sul",clarerafinaldaIlha[0]);
        finalroom.setExit("voltar para clareira inicial mais a leste",clarerafinaldaIlha[1]);
        finalroom.setExit("voltar para clareira inicial mais a oeste",clarerafinaldaIlha[2]);
        //-------------------------------------------------------------------------------------------------------------------
        
        //------------------------------------------------------------------------------------------------------------------
        Personagem capanga1 = new Vilao("Capanga1", 2);
        Personagem capanga2 = new Vilao("Capanga2", 2);
        lab.inserirPersonagem(capanga1);
        lab.inserirPersonagem(capanga2);
        
        office.setExit("west", lab);
        Personagem coringa = new Vilao("Coringa", 5);
        office.inserirPersonagem(coringa);

        currentRoom = outside;  // start game outside
    }

    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    private void look() {
        System.out.println(currentRoom.getLongDescription());
    }
    
    
    

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
