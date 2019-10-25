/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesafioGeografia;

import javax.swing.JOptionPane;

/**
 * Prova DB1 Start. Desafio de Geografia. Ler nome da cidade e informar: A qual
 * estado a cidade pertence Se é capital ou não O conjunto de cidades permitidas
 * deve ser: Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinvile, Blumenau,
 * Florianópolis, Porto Alegre, Gramado.
 *
 * @author ktia-
 */
public class InputOutput {

    public static String perguntarCidade() {
        String nomeCidade = JOptionPane.showInputDialog("Informe o nome da cidade: \n\nObs: "
                + "apenas Curitiba, Maringá, Londrina, Pinhais, Chapecó, \n"
                + "Joinvile, Blumenau, Florianópolis, Porto Alegre e "
                + "Gramado são permitidas.\n");
        return nomeCidade;
    }

    public static void mostrar(String nomeCidade, String estado, String capital, String mensagem) {
        TrataValida t = new TrataValida();
        JOptionPane pane = new JOptionPane();
        
        try {
            nomeCidade = perguntarCidade();

            if (!t.inputValida(nomeCidade)) {
                pane.showMessageDialog(pane, "Tchau!");
            } else {
                nomeCidade = t.tratarInput(nomeCidade);
                estado = t.uf(nomeCidade);
                if (!t.cidadeValida(estado)) {
                    mensagem = estado;
                } else {
                    capital = t.capital(nomeCidade);
                    mensagem = estado + "\n" + capital;
                }
                JOptionPane.showMessageDialog(pane, mensagem);
                mostrar(nomeCidade, estado, capital, mensagem);
            }
        } catch (Exception e) {
            pane.showMessageDialog(pane, "Ops! Parece que ocorreu um erro!");
        }

    }

}
