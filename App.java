package br.edu.catolica.es.subway;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var molhos = Arrays.asList("Agridoce", "Maionese", "Mostarda"); // Lista de molhos
        var sanduiche1 = new SanduicheBuilder("Parmesao")
                .recheio("Camarao")
                .molho(molhos) // Passa a lista de molhos
                .extra("Cebola Caramelizada")
                .create();

        System.out.println("Sanduiche 1: "+sanduiche1);
    }
}