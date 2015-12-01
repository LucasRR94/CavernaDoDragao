package wozuul;
import itens.Item;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import personagens.Personagem;


/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Room 
{
    private String description;
    private int viloesVivos;
    private HashMap<String, Room> exits;       // stores exits of this room.
    private HashMap<String, Personagem> personagens;
    private HashMap<String, Item>itens;
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap <String, Room>();
        personagens = new HashMap <String, Personagem> ();
        itens = new HashMap<String,Item>();
        viloesVivos = 0;
    }
    
    public Room(){
        exits       = new HashMap <String, Room>();
        personagens = new HashMap <String, Personagem> ();
    }
    public Item getitem(String item){
    	if(viloesVivos == 0){
	        Item novo = itens.get(item);
	        itens.remove(item); //retorna e tira da sala
	        return(novo);
    	}else{
    		return null;
    	}
    }
    public void addItem(Item novo){
        itens.put(novo.getname(), novo);
    }
    public void listItens(){
        Set <String> chaves  = itens.keySet();
        for(String chave : chaves){
            if(chave !=null){
                Item novo = itens.get(chave);
                novo.getdescricao();
                System.out.println("energia"+ novo.getenergy());
                System.out.println("valor"  + novo.getvalue());
                System.out.println("ataque" + novo.getvalueatack());
                System.out.println("defesa" + novo.getvaluedefense());
         }
        
        }
    }
    

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "Você está " + description + ".\n"
               + getExitString() + "\n"
               + pegaPersonagensString() + "\n"
               + pegaItensString();
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Saídas:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    private String pegaPersonagensString()
    {
        String returnString = "Vilões:";
        Set<String> keys = personagens.keySet();
        for(String nome : keys) {
            returnString += " " + nome;
        }
        return returnString;
    }
    
    private String pegaItensString()
    {
        String returnString = "Itens:";
        Set<String> keys = itens.keySet();
        for(String nome : keys) {
            returnString += " " + nome;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
    
    public Personagem pegaPersonagem(String nome) {
        return personagens.get(nome);
    }
    
    public void inserirPersonagem(Personagem personagem) {
        personagens.put(personagem.pegaNome(), personagem);
        viloesVivos++;
    }
    
    public void removePersonagem(String nome){
    	personagens.remove(nome);
    	viloesVivos--;
    }
    
    public int getViloesVivos(){
    	return viloesVivos;
    }
}

