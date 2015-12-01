package wozuul;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;
import itens .*;
import personagens.Chefe;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import personagens.Vilao;


/**
 *
 * @author lucas
 */
public class LeituradeCenario {
    int fim;
    public LeituradeCenario(){
        this.fim=0;
    }
    public Object inicialeitura(){
        Scanner ler = new Scanner(System.in);
        String nome = "arquivo.txt";
        int energia;
        // TODO code application logic here
        try{ 
             FileReader arq = new FileReader(nome);
             BufferedReader lerArq = new BufferedReader(arq);
             String linha = lerArq.readLine();
             while (linha != null) {
                 if(linha.equals("Alimento")){ //lendo Alimento e seus atributos
                     String name = lerArq.readLine();
                     String descricao = lerArq.readLine();
                     String acrescimoenergia = lerArq.readLine();
                     String peso = lerArq.readLine();
                     Alimento novo = new Alimento(name,descricao,Integer.parseInt(acrescimoenergia),Integer.parseInt(peso));
                     return(novo);
                 }
                 if(linha.equals("MagiaAtaque")){
                     String name = lerArq.readLine();
                     String descricao = lerArq.readLine();
                     String capacidadeataque = lerArq.readLine();
                     MagiaAtaque magic = new MagiaAtaque(name,descricao,Integer.parseInt(capacidadeataque));
                     return(magic);
                 }
                 if(linha.equals("MagiaDefesa")){
                     String name = lerArq.readLine();
                     String descricao = lerArq.readLine();
                     String capacidadededefesa = lerArq.readLine(); 
                     MagiaDefesa magic = new MagiaDefesa(name,descricao,Integer.parseInt(capacidadededefesa));
                     return(magic);
                 }
                 if(linha.equals("Arma")){
                     String rapidez = lerArq.readLine();
                     String forca = lerArq.readLine();
                     String name = lerArq.readLine();
                     String descricao = lerArq.readLine();
                     Arma armamento = new Arma(Integer.parseInt(rapidez),Integer.parseInt(forca),name,descricao);
                     return(armamento);
                 }
                 if(linha.equals("Defesa")){
                     String tamanho = lerArq.readLine();
                     String peso = lerArq.readLine();
                     String name = lerArq.readLine();
                     String descricao = lerArq.readLine();
                     Defesa defense = new Defesa(Integer.parseInt(tamanho),Integer.parseInt(peso),name,descricao);
                     return(defense);
                 }
                 if(linha.equals("Chefe")){
                     String name = lerArq.readLine();
                     String energy = lerArq.readLine();
                     String ataque = lerArq.readLine();
                     String defesa = lerArq.readLine();
                     String quantiamoedas = lerArq.readLine();
                     String magia = lerArq.readLine();
                     if(magia.equals("MagiaDeAtaque")){
                          String name0 = lerArq.readLine();
                          String descricao = lerArq.readLine();
                          String capacidadeataque = lerArq.readLine();
                          MagiaAtaque magic = new MagiaAtaque(name,descricao,Integer.parseInt(capacidadeataque));
                          Chefe boss = new Chefe(name,Integer.parseInt(energy),Integer.parseInt(ataque),Integer.parseInt(defesa),Integer.parseInt(quantiamoedas));
                          return(boss);
                     }
                     if(magia.equals("MagiaDefesa")){
                          String name1 = lerArq.readLine();
                          String descricao = lerArq.readLine();
                          String capacidadededefesa = lerArq.readLine(); 
                          MagiaDefesa magic = new MagiaDefesa(name,descricao,Integer.parseInt(capacidadededefesa));
                          Chefe boss = new Chefe(name,Integer.parseInt(energy),Integer.parseInt(ataque),Integer.parseInt(defesa),Integer.parseInt(quantiamoedas));
                          return(boss);  
                     }
                  }
                 if(linha.equals("Comum")){
                     String name = lerArq.readLine();
                     String energy = lerArq.readLine();
                     String ataque = lerArq.readLine();
                     String defesa = lerArq.readLine();
                     String quantiamoedas = lerArq.readLine();
                     Vilao candango = new Vilao(name,Integer.parseInt(energy),Integer.parseInt(ataque),Integer.parseInt(defesa),Integer.parseInt(quantiamoedas));
                     return(candango);
                 }
             }
         
        }
         catch (IOException e) {
             System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
             System.out.println();
             
         }
         this.fim = 1;
         return(null);
    }
    
 }

