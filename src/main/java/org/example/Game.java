package org.example;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arvoreCerta = random.nextInt(100) + 1;

        System.out.println(" Bem-vindo ao Jogo do Marciano!");
        System.out.println("O marciano está escondido atrás de uma das 100 árvores.");
        System.out.println("Escolha um número entre 1 à 100 para encontrá-lo!");

        int tentativa;
        boolean acertou = false;

        do {
            System.out.println("Digite o número da árvore: ");
            tentativa = scanner.nextInt();

            if (tentativa < 1) {
                System.out.println(" Número  pequeno, escolha um número entre 1 e 100.");
                continue;
            }

            if (tentativa > 100) {
                System.out.println("Número  grande, escolha um número entre 1 e 100.");
                continue;
            }

            int diferenca = Math.abs(tentativa - arvoreCerta);

            if (tentativa == arvoreCerta) {
                System.out.println(" Parabéns! Você encontrou o marciano na árvore " + arvoreCerta + "!");
                acertou = true;
            } else {
                if (diferenca <= 5) {
                    System.out.println("Você está muito perto!");
                } else if (diferenca <= 15) {
                    System.out.println("Está chegando perto!");
                } else {
                    System.out.println("Está longe, Tente um número mais próximo.");
                }
            }
        } while (!acertou);

        scanner.close();
    }
}


