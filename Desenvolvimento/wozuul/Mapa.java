package wozuul;
import itens.Alimento;
import itens.Arma;
import itens.Defesa;
import itens.Item;
import itens.MagiaAtaque;
import itens.MagiaDefesa;

import java.util.Random;

import personagens.*;
/**
 * Escreva a descrição da classe Mapa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Mapa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public Room current;
    private LeituradeCenario novo;
    /**
     * Construtor para objetos da classe Mapa
     */
    public Mapa()
    {
        // inicializa variáveis de instância
        novo = new LeituradeCenario();
        createRooms();    
    }
        
    public void createRooms()
    {
        //-------------------------------------------------------------------------------------------------------
        Room[] atracagemDeBarcoIlha1    = new Room[6]; //ilha possue 6 entradas que levam a 2 clareras 
        Room[] atracagemDeBarcoIlha2    = new Room[6]; //ilha possue 6 entradas que levam a 2 clareras 
        Room[] atracagemDeBarcoIlha3    = new Room[6]; //ilha possue 6 entradas que levam a 2 clareras 
        Room[] clareraNoMeioDaIlha      = new Room[6]; //em cada ilha possuem duas clareras que levam a uma outra clarera
        Room[] clareraFinalDaIlha       = new Room[3]; //clarera que leva ao final da ilha secundaria e ao inicio da ilha central
        Room[] clareraInicialIlhaCentral= new Room[3];//primeira clarera que leva ao chefe e a sala final
        Room finalroom;//sala final
        //--------------------------------------------------------------------------------------------------------
        
        Room water;//fase inicial onde o barco está na agua ele possue 18 entradas possiveis
        
        Room ilha1; 
        Room ilha2;
        Room ilha3;
        //-Pre-Begin---------------------------------------------------------------------------------------------------------
        water = new Room("Você está atualmente em um barco, observando um conjunto de tres ilhas que se juntam em uma");
        //Begin--------------------------------------------------------------------------------------------------------
        ilha1 = new Room("Você está na ilha sul atualmente.");
        ilha2 = new Room("Você está na ilha leste atualmente.");
        ilha3 = new Room("Você está na ilha oeste atualmente.");
        //-Nivel-1--------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[0] = new Room("mais oeste da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[1] = new Room("mais central oeste da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[2] = new Room("mais sul da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[3] = new Room("mais sul da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[4] = new Room("mais centro leste da ilha sul em uma clareira");
        atracagemDeBarcoIlha1[5] = new Room("mais leste da ilha sul em uma clareira");
        //-Nivel-1--------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[0] = new Room("mais oeste da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[1] = new Room("mais central oeste da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[2] = new Room("mais sul da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[3] = new Room("mais sul da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[4] = new Room("mais centro leste da ilha leste em uma clareira");
        atracagemDeBarcoIlha2[5] = new Room("mais leste da ilha leste em uma clareira");
        //-Nivel-1---------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[0] = new Room("mais oeste da ilha oeste em uma clareira");
        atracagemDeBarcoIlha3[1] = new Room("mais central oeste da ilha oeste em uma clareira");
        atracagemDeBarcoIlha3[2] = new Room("mais sul da ilha oeste em uma clareira");
        atracagemDeBarcoIlha3[3] = new Room("mais sul da ilha oeste em uma clareira");
        atracagemDeBarcoIlha3[4] = new Room("mais centro leste da ilha oeste em uma clareira");
        atracagemDeBarcoIlha3[5] = new Room("mais leste da ilha oeste em uma clareira");
        //-Nivel-2--------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[0] = new Room("em uma clareira mais central da ilha sul. Você passou pelo primeiro nível.");   
        clareraNoMeioDaIlha[1] = new Room("em uma clareira mais central da ilha sul. Você passou pelo primeiro nível.");
        clareraNoMeioDaIlha[2] = new Room("em uma clareira mais central da ilha leste. Você passou pelo primeiro nível.");
        clareraNoMeioDaIlha[3] = new Room("em uma clareira mais central da ilha leste. Você passou pelo primeiro nível.");
        clareraNoMeioDaIlha[4] = new Room("em uma clareira mais central da ilha oeste. Você passou pelo primeiro nível.");
        clareraNoMeioDaIlha[5] = new Room("em uma clareira mais central da ilha oeste. Você passou pelo primeiro nível.");
        //-Nivel-3--------------------------------------------------------------------------------------------------------
        clareraFinalDaIlha[0] = new Room("na clareira final da ilha sul. Você passou pelo segundo nível.");    
        clareraFinalDaIlha[1] = new Room("na clareira final da ilha leste. Você passou pelo segundo nível.");    
        clareraFinalDaIlha[2] = new Room("na clareira final da ilha oeste. Você passou pelo segundo nível.");    
        //-Nivel-4---------------------------------------------------------------------------------------------------------
        clareraInicialIlhaCentral[0] = new Room("na clareira inicial da ilha central misteriosa. Você passou pelo terceiro nível.");
        clareraInicialIlhaCentral[1] = new Room("na clareira inicial da ilha central misteriosa. Você passou pelo terceiro nível.");
        clareraInicialIlhaCentral[2] = new Room("na clareira inicial da ilha central misteriosa. Você passou pelo terceiro nível.");
       	//-Nivel-5------------------------------------------------------------------------------------------------------
        finalroom = new Room("na clareira central da ilha, no meio da ilha central misteriosa. Você passou pelo quarto nível.");
        //----------------------------------------------------------------------------------------------------------------
        
        //Initialise room Exits-------------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------
        water.setExit("ilha_sul",ilha1);
        water.setExit("ilha_leste",ilha2);
        water.setExit("ilha_oeste",ilha3);
        //-----------------------------------------------------------------------------------------------------------------
        //ILHA 1
        //-----------------------------------------------------------------------------------------------------------------
        ilha1.setExit("clareira_oeste",atracagemDeBarcoIlha1[0]);
        ilha1.setExit("clareira_central_oeste",atracagemDeBarcoIlha1[1]);
        ilha1.setExit("clareira_sul_esquerda",atracagemDeBarcoIlha1[2]);
        ilha1.setExit("clareira_sul_direita",atracagemDeBarcoIlha1[3]);
        ilha1.setExit("clareira_central_leste",atracagemDeBarcoIlha1[4]);
        ilha1.setExit("clareira_leste",atracagemDeBarcoIlha1[5]);
        //-----------------------------------------------------------------------------------------------------------------
        ilha1.setExit("voltar_barco",water); //VOLTA
        //-----------------------------------------------------------------------------------------------------------------
        //ILHA 2
        //-----------------------------------------------------------------------------------------------------------------
        ilha2.setExit("clareira_oeste",atracagemDeBarcoIlha2[0]);
        ilha2.setExit("clareira_central_oeste",atracagemDeBarcoIlha2[1]);
        ilha2.setExit("clareira_sul_esquerda",atracagemDeBarcoIlha2[2]);
        ilha2.setExit("clareira_sul_direita",atracagemDeBarcoIlha2[3]);
        ilha2.setExit("clareira_central_leste",atracagemDeBarcoIlha2[4]);
        ilha2.setExit("clareira_leste",atracagemDeBarcoIlha2[5]);
        //-----------------------------------------------------------------------------------------------------------------
        ilha2.setExit("voltar_barco",water); //VOLTA 
        //-----------------------------------------------------------------------------------------------------------------
        //ILHA 3
        //-----------------------------------------------------------------------------------------------------------------
        ilha3.setExit("clareira_oeste",atracagemDeBarcoIlha3[0]);
        ilha3.setExit("clareira_central_oeste",atracagemDeBarcoIlha3[1]);
        ilha3.setExit("clareira_sul_esquerda",atracagemDeBarcoIlha3[2]);
        ilha3.setExit("clareira_sul_direita",atracagemDeBarcoIlha3[3]);
        ilha3.setExit("clareira_central_leste",atracagemDeBarcoIlha3[4]);
        ilha3.setExit("clareira_leste",atracagemDeBarcoIlha3[5]);
        //-----------------------------------------------------------------------------------------------------------------
        ilha3.setExit("voltar_barco",water); //volta
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[0].setExit("clareira_central_ilha_sul",clareraNoMeioDaIlha[0]);
        atracagemDeBarcoIlha1[0].setExit("voltar_inicio_ilha",ilha1);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[1].setExit("clareira_central_ilha_sul",clareraNoMeioDaIlha[0]);
        atracagemDeBarcoIlha1[1].setExit("voltar_inicio_ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[2].setExit("clareira_central_ilha_sul",clareraNoMeioDaIlha[0]);
        atracagemDeBarcoIlha1[2].setExit("voltar_inicio_ilha",ilha1);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[3].setExit("clareira_central_ilha_sul",clareraNoMeioDaIlha[1]);
        atracagemDeBarcoIlha1[3].setExit("voltar_inicio_ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[4].setExit("clareira_central_ilha_sul",clareraNoMeioDaIlha[1]);
        atracagemDeBarcoIlha1[4].setExit("voltar_inicio_ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha1[5].setExit("clareira_central_ilha_sul",clareraNoMeioDaIlha[1]);
        atracagemDeBarcoIlha1[5].setExit("voltar_inicio_ilha",ilha1);
        //----------------------------------------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[0].setExit("clareira_central_ilha_leste",clareraNoMeioDaIlha[2]);
        atracagemDeBarcoIlha2[0].setExit("voltar_inicio_ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[1].setExit("clareira_central_ilha_leste",clareraNoMeioDaIlha[2]);
        atracagemDeBarcoIlha2[1].setExit("voltar_inicio_ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[2].setExit("clareira_central_ilha_leste",clareraNoMeioDaIlha[2]);
        atracagemDeBarcoIlha2[2].setExit("voltar_inicio_ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[3].setExit("clareira_central_ilha_leste",clareraNoMeioDaIlha[3]);
        atracagemDeBarcoIlha2[3].setExit("voltar_inicio_ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[4].setExit("clareira_central_ilha_leste",clareraNoMeioDaIlha[3]);
        atracagemDeBarcoIlha2[4].setExit("voltar_inicio_ilha",ilha2);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha2[5].setExit("clareira_central_ilha_leste",clareraNoMeioDaIlha[3]);
        atracagemDeBarcoIlha2[5].setExit("voltar_inicio_ilha",ilha2);
        //-----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[0].setExit("clareira_central_ilha_oeste",clareraNoMeioDaIlha[4]);
        atracagemDeBarcoIlha3[0].setExit("voltar_inicio_ilha",ilha3);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[1].setExit("clareira_central_ilha_oeste",clareraNoMeioDaIlha[4]);
        atracagemDeBarcoIlha3[1].setExit("voltar_inicio_ilha",ilha3);
        //----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[2].setExit("clareira_central_ilha_oeste",clareraNoMeioDaIlha[4]);
        atracagemDeBarcoIlha3[2].setExit("voltar_inicio_ilha",ilha3);
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[3].setExit("clareira_central_ilha_oeste",clareraNoMeioDaIlha[5]);
        atracagemDeBarcoIlha3[3].setExit("voltar_inicio_ilha",ilha3);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[4].setExit("clareira_central_ilha_oeste",clareraNoMeioDaIlha[5]);
        atracagemDeBarcoIlha3[4].setExit("voltar_inicio_ilha",ilha3);
        //----------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        atracagemDeBarcoIlha3[5].setExit("clareira_central_ilha_oeste",clareraNoMeioDaIlha[5]);
        atracagemDeBarcoIlha3[5].setExit("voltar_inicio_ilha",ilha3);
        //-----------------------------------------------------------------------------------------------------------------
        //volta da clareira central
        //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[0].setExit("voltar_clareira_inicial_ilha_sul_oeste",atracagemDeBarcoIlha1[0]);
        clareraNoMeioDaIlha[0].setExit("voltar_clareira_inicial_ilha_sul_central_oeste",atracagemDeBarcoIlha1[1]);
        clareraNoMeioDaIlha[0].setExit("voltar_clareira_inicial_ilha_sul_sul_esquerda",atracagemDeBarcoIlha1[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[1].setExit("voltar_clareira_inicial_ilha_sul_sul_direita",atracagemDeBarcoIlha1[3]);
        clareraNoMeioDaIlha[1].setExit("voltar_clareira_inicial_ilha_sul_central_leste",atracagemDeBarcoIlha1[4]);
        clareraNoMeioDaIlha[1].setExit("voltar_clareira_inicial_ilha_sul_leste",atracagemDeBarcoIlha1[5]);
        //------------------------------------------------------------------------------------------------------------------
        
        //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[2].setExit("voltar_clareira_inicial_ilha_leste_oeste",atracagemDeBarcoIlha2[0]);
        clareraNoMeioDaIlha[2].setExit("voltar_clareira_inicial_ilha_leste_central_oeste",atracagemDeBarcoIlha2[1]);
        clareraNoMeioDaIlha[2].setExit("voltar_clareira_inicial_ilha_leste_sul_esquerda",atracagemDeBarcoIlha2[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[3].setExit("voltar_clareira_inicial_ilha_leste_sul_direita",atracagemDeBarcoIlha2[3]);
        clareraNoMeioDaIlha[3].setExit("voltar_clareira_inicial_ilha_leste_central_leste",atracagemDeBarcoIlha2[4]);
        clareraNoMeioDaIlha[3].setExit("voltar_clareira_inicial_ilha_leste_leste",atracagemDeBarcoIlha2[5]);
        //------------------------------------------------------------------------------------------------------------------
        
       /* //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[4].setExit("voltar a clareira inicial da ilha leste, mais a oeste",atracagemDeBarcoIlha3[0]);
        clareraNoMeioDaIlha[4].setExit("voltar a clareira inicial da ilha leste, mais a central oeste",atracagemDeBarcoIlha3[1]);
        clareraNoMeioDaIlha[4].setExit("voltar a clareira inicial da ilha leste, mais a sul esquerda",atracagemDeBarcoIlha3[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[5].setExit("voltar a clareira inicial da ilha leste, mais a sul direita",atracagemDeBarcoIlha3[3]);
        clareraNoMeioDaIlha[5].setExit("voltar a clareira inicial da ilha leste, mais a central leste",atracagemDeBarcoIlha3[4]);
        clareraNoMeioDaIlha[5].setExit("voltar a clareira inicial da ilha leste, mais a leste",atracagemDeBarcoIlha3[5]);
        //------------------------------------------------------------------------------------------------------------------*/
        
        //-----------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[4].setExit("voltar_clareira_inicial_ilha_oeste_oeste",atracagemDeBarcoIlha3[0]);
        clareraNoMeioDaIlha[4].setExit("voltar_clareira_inicial_ilha_oeste_central_oeste",atracagemDeBarcoIlha3[1]);
        clareraNoMeioDaIlha[4].setExit("voltar_clareira_inicial_ilha_oeste_sul_esquerda",atracagemDeBarcoIlha3[2]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[5].setExit("voltar_clareira_inicial_ilha_oeste_sul_direita",atracagemDeBarcoIlha3[3]);
        clareraNoMeioDaIlha[5].setExit("voltar_clareira_inicial_ilha_oeste_central leste",atracagemDeBarcoIlha3[4]);
        clareraNoMeioDaIlha[5].setExit("voltar_clareira_inicial_ilha_oeste_leste",atracagemDeBarcoIlha3[5]);
        //------------------------------------------------------------------------------------------------------------------
        
        //ida ao final da ilha
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[0].setExit("final_ilha",clareraFinalDaIlha[0]);
        clareraNoMeioDaIlha[1].setExit("final_ilha",clareraFinalDaIlha[0]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[2].setExit("final_ilha",clareraFinalDaIlha[1]);
        clareraNoMeioDaIlha[3].setExit("final_ilha",clareraFinalDaIlha[1]);
        //------------------------------------------------------------------------------------------------------------------
        clareraNoMeioDaIlha[4].setExit("final_ilha",clareraFinalDaIlha[2]);
        clareraNoMeioDaIlha[5].setExit("final_ilha",clareraFinalDaIlha[2]);
        //------------------------------------------------------------------------------------------------------------------
        //Volta da saida da ilha
        //------------------------------------------------------------------------------------------------------------------
        clareraFinalDaIlha[0].setExit("voltar_clareira_central_esquerda_ilha_sul",clareraNoMeioDaIlha[0]);
        clareraFinalDaIlha[0].setExit("voltar_clareira_central_direta_ilha_sul",clareraNoMeioDaIlha[1]);
        //------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------
        clareraFinalDaIlha[1].setExit("voltar_clareira_central_esquerda_ilha_leste",clareraNoMeioDaIlha[2]);
        clareraFinalDaIlha[1].setExit("voltar_clareira_central_direita_ilha_leste",clareraNoMeioDaIlha[3]);
        //------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------
        clareraFinalDaIlha[2].setExit("voltar_clareira_central_esquerda_ilha_leste",clareraNoMeioDaIlha[4]);
        clareraFinalDaIlha[2].setExit("voltar_clareira_central_direita_ilha_leste",clareraNoMeioDaIlha[5]);
        //------------------------------------------------------------------------------------------------------------------
        //ir para clareira inicial da ilha final
        //------------------------------------------------------------------------------------------------------------------
        clareraFinalDaIlha[0].setExit("clareira_inicio_ilha_final",clareraInicialIlhaCentral[0]);
        clareraFinalDaIlha[1].setExit("clareira_inicio_ilha_final",clareraInicialIlhaCentral[1]);
        clareraFinalDaIlha[2].setExit("clareira_inicio_ilha_final",clareraInicialIlhaCentral[2]);
        //------------------------------------------------------------------------------------------------------------------
        //volta para clareira final da ilha 
        clareraInicialIlhaCentral[0].setExit("voltar_clareira_final_ilha_sul",clareraFinalDaIlha[0]);
        clareraInicialIlhaCentral[1].setExit("voltar_clareira_final_ilha_leste",clareraFinalDaIlha[1]);
        clareraInicialIlhaCentral[2].setExit("voltar_clareira_final_ilha_oeste",clareraFinalDaIlha[2]);
        //------------------------------------------------------------------------------------------------------------------
        //Indo para clareira final da ilha central
        //------------------------------------------------------------------------------------------------------------------
        clareraFinalDaIlha[0].setExit("clareira_central_ilha_principal",finalroom);
        clareraFinalDaIlha[1].setExit("clareira_central_ilha_principal",finalroom);
        clareraFinalDaIlha[2].setExit("clareira_central_ilha_principal",finalroom);
        //------------------------------------------------------------------------------------------------------------------
        
        //Volta da clareira final
        //-------------------------------------------------------------------------------------------------------------------
        finalroom.setExit("voltar_clareira_inicial_sul",clareraFinalDaIlha[0]);
        finalroom.setExit("voltar_clareira_inicial_leste",clareraFinalDaIlha[1]);
        finalroom.setExit("voltar_clareira_inicial_oeste",clareraFinalDaIlha[2]);
        //-------------------------------------------------------------------------------------------------------------------
        
        //------------------------------------------------------------------------------------------------------------------
        while(novo.fim!=0){
            Object novoobject;
            novoobject = novo.inicialeitura(); //novo objeto retorna itens , viloes ...
            
        }
        //Viloes Fracos
        Personagem viloes[] = new Vilao[28];
        viloes[0] = new Vilao("Globin", 2, 2, 2, 10);
        viloes[1] = new Vilao("Caveira", 2, 1, 2, 10);
        viloes[2] = new Vilao("Gosma", 2, 2, 2, 10);
        viloes[3] = new Vilao("Octaedro", 3, 2, 3, 10);
        viloes[4] = new Vilao("Galinha", 3, 4, 3, 15);
        viloes[5] = new Vilao("PitBull", 4, 3, 4, 15);
        viloes[6] = new Vilao("Elemental", 4, 4, 4, 15);
        viloes[7] = new Vilao("GosmaUzi", 4, 5, 5, 20);
        viloes[8] = new Vilao("Harpias", 5, 5, 5, 20);
        viloes[9] = new Vilao("Cavalo", 6, 3, 5, 20);
        
        //Viloes Médios
        viloes[10] = new Vilao("Cachorro", 7, 4, 5, 20);
        viloes[11] = new Vilao("Nerd", 6, 6, 5, 20);
        viloes[12] = new Vilao("ChupaCara", 8, 7, 8, 25);
        viloes[13] = new Vilao("Orc", 9, 10, 5, 30);
        viloes[14] = new Vilao("Esfinge", 12, 8, 7, 30);
        viloes[15] = new Vilao("PeGrande", 10, 4, 12, 30);
        viloes[16] = new Vilao("HorrorAterrorizante", 6, 10, 14, 35);
        viloes[17] = new Vilao("Vendedor", 14, 10, 12, 40);
        viloes[18] = new Vilao("OPadrinho", 12, 10, 13, 40);
        viloes[19] = new Vilao("Golem", 14, 13, 14, 45);
        
        //Viloes Fortes
        viloes[20] = new Vilao("Gorila", 15, 10, 13, 45);
        viloes[21] = new Vilao("OlhoMal", 15, 16, 13, 45);
        viloes[22] = new Vilao("Hipopogrifo", 16, 14, 16, 45);
        viloes[23] = new Vilao("Tibio", 16, 11, 13, 45);
        viloes[24] = new Vilao("CaminhaoMonstro", 15, 17, 14, 50);
        viloes[25] = new Vilao("Polvozilla", 17, 18, 18, 50);
        viloes[26] = new Vilao("Cavaleiro", 18, 16, 19, 55);
        viloes[27] = new Vilao("Balrog", 19, 20, 16, 55);
        
        //Viloes Chefes
        Chefe chefes[] = new Chefe[3];
        chefes[0] = new Chefe("Gigante", 19, 22, 20, 65);
        chefes[1] = new Chefe("Dragao", 20, 21, 23, 70);
        chefes[2] = new Chefe("Katrina", 21, 24, 22, 70);
        
        Random gerador = new Random();
        
        // Inserindo viloes nas atracagens de barco da ilha 1
        atracagemDeBarcoIlha1[0].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha1[0].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha1[1].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha1[1].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha1[2].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha1[3].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha1[4].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha1[4].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha1[5].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        // Inserindo viloes nas atracagens de barco da ilha 2
        atracagemDeBarcoIlha2[0].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha2[1].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha2[1].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha2[2].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha2[2].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha2[3].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha2[4].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha2[5].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        // Inserindo viloes nas atracagens de barco da ilha 3
        atracagemDeBarcoIlha3[0].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha3[1].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha3[2].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha3[3].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha3[3].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha3[4].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        atracagemDeBarcoIlha3[5].inserirPersonagem(viloes[gerador.nextInt(10)]);
        atracagemDeBarcoIlha3[5].inserirPersonagem(viloes[gerador.nextInt(10)]);
        
        //Inserido viloes nas clareiras no meio da ilha
        clareraNoMeioDaIlha[0].inserirPersonagem(viloes[gerador.nextInt(10)+10]);
        clareraNoMeioDaIlha[1].inserirPersonagem(viloes[gerador.nextInt(10)+10]);
        clareraNoMeioDaIlha[2].inserirPersonagem(viloes[gerador.nextInt(10)+10]);
        clareraNoMeioDaIlha[3].inserirPersonagem(viloes[gerador.nextInt(10)+10]);
        clareraNoMeioDaIlha[4].inserirPersonagem(viloes[gerador.nextInt(10)+10]);
        clareraNoMeioDaIlha[5].inserirPersonagem(viloes[gerador.nextInt(10)+10]);
        
        //Inserido viloes nas clareiras no final da ilha
        clareraFinalDaIlha[0].inserirPersonagem(viloes[gerador.nextInt(8)+20]);
        clareraFinalDaIlha[1].inserirPersonagem(viloes[gerador.nextInt(8)+20]);
        clareraFinalDaIlha[2].inserirPersonagem(viloes[gerador.nextInt(8)+20]);
        
        //Inserido viloes nas clareiras da ilha central
        clareraInicialIlhaCentral[0].inserirPersonagem(viloes[gerador.nextInt(8)+20]);
        clareraInicialIlhaCentral[1].inserirPersonagem(viloes[gerador.nextInt(8)+20]);
        clareraInicialIlhaCentral[2].inserirPersonagem(viloes[gerador.nextInt(8)+20]);
        
        //Inserido vilão chefe na sala final
        finalroom.inserirPersonagem(chefes[gerador.nextInt(3)]);
        
        //Itens
        Item itens[] = new Item[28];
        itens[0] = new Arma(5, 4, "Broquel", "Broquel da Bravata");
        itens[1] = new Arma(2, 1, "Espetinho", "Espetinho de Rato");
        itens[2] = new Arma(6, 8, "Martelo", "Martelo Detona Joelho");
        itens[3] = new Arma(10, 6, "Foice", "Foice de 2 Pontas");
        itens[4] = new Arma(2, 3, "Lança", "Lança Muito Grande");
        itens[5] = new Arma(5, 5, "Cajado", "Cajado de Napalm");
        itens[6] = new Arma(4, 6, "Clava", "Clava de Plutônio");
        itens[7] = new Arma(8, 10, "Alabarda", "Alabarda Suíça");
        itens[8] = new Arma(2, 4, "Escada", "Escada de Mão");
        itens[9] = new Arma(6, 8, "Arco", "Arco Metido a Besta");
        itens[10] = new MagiaAtaque("IcedSpikes", "Magia de Ataque", 5);
        itens[11] = new MagiaAtaque("DarkMatter", "Magia de Ataque", 6);
        itens[12] = new MagiaAtaque("FlameTwhirl", "Magia de Ataque", 3);
        itens[13] = new MagiaAtaque("Earthquake", "Magia de Ataque", 10);
        itens[14] = new MagiaAtaque("Whirwhilind", "Magia de Ataque", 8);
        itens[15] = new Defesa(2, 3, "WoodenShield", "Escudo de Defesa");
        itens[16] = new Defesa(4, 3, "IcedShield", "Escudo de Defesa");
        itens[17] = new Defesa(10, 7, "DarkShield", "Escudo de Defesa");
        itens[18] = new Defesa(6, 6, "MirrorShield", "Escudo de Defesa");
        itens[19] = new Defesa(3, 10, "EarthShield", "Escudo de Defesa");
        itens[20] = new MagiaDefesa("ReverseMirror", "Magia de Defesa", 9);
        itens[21] = new MagiaDefesa("WindShield", "Magia de Defesa", 2);
        itens[22] = new MagiaDefesa("EarthWall", "Magia de Defesa", 7);
        itens[23] = new MagiaDefesa("WaterWall", "Magia de Defesa", 5);
        itens[24] = new MagiaDefesa("BubbleWall", "Magia de Defesa", 4);
        itens[25] = new Alimento("Lasanha", "Alimento", 10, 5);
        itens[26] = new Alimento("Pizza", "Alimento", 7, 4);
        itens[27] = new Alimento("Batata", "Alimento", 3, 1);
        
        // Inserindo itens nas atracagens de barco da ilha 1
        atracagemDeBarcoIlha1[0].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha1[1].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha1[2].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha1[3].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha1[4].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha1[5].addItem(itens[gerador.nextInt(28)]);
        
        // Inserindo itens nas atracagens de barco da ilha 2
        atracagemDeBarcoIlha2[0].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha2[1].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha2[2].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha2[3].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha2[4].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha2[5].addItem(itens[gerador.nextInt(28)]);
        
        // Inserindo itens nas atracagens de barco da ilha 3
        atracagemDeBarcoIlha3[0].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha3[1].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha3[2].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha3[3].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha3[4].addItem(itens[gerador.nextInt(28)]);
        
        atracagemDeBarcoIlha3[5].addItem(itens[gerador.nextInt(28)]);
        
        //Inserido itens nas clareiras no meio da ilha
        clareraNoMeioDaIlha[0].addItem(itens[gerador.nextInt(28)]);
        clareraNoMeioDaIlha[1].addItem(itens[gerador.nextInt(28)]);
        clareraNoMeioDaIlha[2].addItem(itens[gerador.nextInt(28)]);
        clareraNoMeioDaIlha[3].addItem(itens[gerador.nextInt(28)]);
        clareraNoMeioDaIlha[4].addItem(itens[gerador.nextInt(28)]);
        clareraNoMeioDaIlha[5].addItem(itens[gerador.nextInt(28)]);
        
        //Inserido itens nas clareiras no final da ilha
        clareraFinalDaIlha[0].addItem(itens[gerador.nextInt(28)]);
        clareraFinalDaIlha[1].addItem(itens[gerador.nextInt(28)]);
        clareraFinalDaIlha[2].addItem(itens[gerador.nextInt(28)]);
        
        //Inserido itens nas clareiras da ilha central
        clareraInicialIlhaCentral[0].addItem(itens[gerador.nextInt(28)]);
        clareraInicialIlhaCentral[1].addItem(itens[gerador.nextInt(28)]);
        clareraInicialIlhaCentral[2].addItem(itens[gerador.nextInt(28)]);
        
        //Inserido item na sala final
        finalroom.addItem(itens[gerador.nextInt(28)]);
        
        current = water;  // start game outside
    
        }
    public boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    public void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        if(current.getViloesVivos() == 0){ //Verifica se todos os viloes foram mortos
	        Room nextRoom = current.getExit(direction);
	
	        if (nextRoom == null) {
	            System.out.println("Local para onde você quer ir não existe!");
	        }
	        else {
	            current = nextRoom;
	            System.out.println(current.getLongDescription());
	        }
        }else{
        	System.out.println("O(s) vilõ(es) não te deixarão sair, até que você os mate!");
        }
    }

    public void look() {
        System.out.println(current.getLongDescription());
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    
}
