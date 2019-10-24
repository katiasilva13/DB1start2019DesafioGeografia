/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesafioGeografia;

/**
 * Desafio de Geografia - 3 - DB1 Start Novembro/2019
 * Programa em que o usuário poderá inserir um nome de cidade. 
 * Qual o estado que a cidade pertence?
 * Se é capital ou não 
 * O conjunto de cidades permitidas é:
 * Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinvile, Blumenau,
 * Florianópolis, Porto Alegre, Gramado. 
 * Cenário para testes: 
 * Ao informar o nome da cidade Curitiba, deve retornar "Pertence ao PR", "É capital" 
 * Ao informar o nome da cidade Maringá, deve retornar "Pertence ao PR", "Não é capital" 
 * Ao informar o nome da cidade Porto Alegre, deve retornar "Pertence ao RS", "É capital"
 * 24/10/2019
 * @author ktia-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputOutput io = new InputOutput();
        String nomeCidade = "";
        String estado = "";
        String capital = "";
        String mensagem = "";
        io.mostrar(nomeCidade, estado, capital, mensagem);

    }

}
