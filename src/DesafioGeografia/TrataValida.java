/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesafioGeografia;

import java.text.Normalizer;
import java.util.Arrays;

/**
 *
 * @author ktia-
 */
public class TrataValida {

    public static String uf(String nomeCidade) {
        String[] pr = {"curitiba", "maringa", "londrina", "pinhais"};
        String[] sc = {"chapeco", "joinvile", "joinville", "blumenau", "florianopolis"};
        String[] rs = {"gramado", "porto alegre"};

        if (Arrays.asList(pr).contains(nomeCidade)) {
            return "Pertence ao Paraná (PR).";
        } else if (Arrays.asList(sc).contains(nomeCidade)) {
            return "Pertence à Santa Catarina (SC).";
        } else if (Arrays.asList(rs).contains(nomeCidade)) {
            return "Pertence ao Rio Grande do Sul (RS).";
        } else {
            return "Cidade não reconhecida.";
        }
    }

    public static String capital(String nomeCidade) {
        String[] capitais = {"curitiba", "florianopolis", "porto alegre"};

        if (Arrays.asList(capitais).contains(nomeCidade)) {
            return "É capital.";
        } else {
            return "Não é capital.";
        }
    }

    public static String tratarInput(String nomeCidade) {
        String convertedString = Normalizer.normalize(nomeCidade, Normalizer.Form.NFD);
        convertedString = convertedString.replaceAll("[^\\p{ASCII}]", "");
        return convertedString.toLowerCase();
    }

    public static boolean inputValida(String nomeCidade) {
        return !(nomeCidade == null || "".equalsIgnoreCase(nomeCidade));
    }

    public static boolean cidadeValida(String estado) {
        return !(estado.equalsIgnoreCase("Cidade não reconhecida."));
    }
    
}
