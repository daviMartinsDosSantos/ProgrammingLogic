package challenge;

import javax.swing.*;

public class Jokenpo {

    public static void main(String[] args) {

        int playerOne = 1, playerTwo = 1;

        while (playerOne != 0 && playerTwo != 0) {

            playerOne = Integer.parseInt(JOptionPane.showInputDialog("Digite (0) para fechar o programa\n 1 - PAPER\n 2 - SCISSOR\n 3 - ROCK"));
            if (playerOne == 0) {
                System.out.println("Player One tip 0 (ZERO) to exit");
                break;
            }
            playerTwo = Integer.parseInt(JOptionPane.showInputDialog("Digite (0) para fechar o programa\n 1 - PAPER\n 2 - SCISSOR\n 3 - ROCK"));
            if (playerTwo == 0) {
                System.out.println("Player Two tip 0 (ZERO) to exit");
                break;
            }
            if (playerOne > 4 || playerOne < 0 || playerTwo > 4 || playerTwo < 0) {
                System.out.println("Invalid value to play");
                continue;
            }
            System.out.println("Player2 colocou um Valor Inválido");

            System.out.println();

            System.out.println("Let's to play Jokenpo");

            System.out.println();

            System.out.println(game(getPlay(playerOne), getPlay(playerTwo)));
           /* System.out.println(game("ROCK", "SCISSOR"));
            System.out.println(game("ROCK", "PAPER"));
            System.out.println();
            System.out.println(game("PAPER", "PAPER"));
            System.out.println(game("PAPER", "SCISSOR"));
            System.out.println(game("PAPER", "ROCK"));
            System.out.println();
            System.out.println(game("SCISSOR", "SCISSOR"));
            System.out.println(game("SCISSOR", "ROCK"));
            System.out.println(game("SCISSOR", "PAPER"));*/
        }
    }

    private static String getPlay(int play) {
        switch (play) {
            case 1:
                return "PAPER";
            case 2:
                return "SCISSOR";
            case 3:
                return "ROCK";
            default:
                return null;
        }
    }

    public static String game(String player1, String player2) {
        String winner = "TIE";

        if (player1.equals("ROCK")) {
            if (player2.equals("SCISSOR")) {
                winner = player1;
            }
            if (player2.equals("PAPER")) {
                winner = player2;
            }
        } else if (player1.equals("PAPER")) {
            if (player2.equals("ROCK")) {
                winner = player1;
            }
            if (player2.equals("SCISSOR")) {
                winner = player2;
            }
        } else if (player1.equals("SCISSOR")) {
            if (player2.equals("ROCK")) {
                winner = player2;
            }
            if (player2.equals("PAPER")) {
                winner = player1;
            }
        }
        return player1 + " X " + player2 + " -> " + winner + " WINNER";


    }
}