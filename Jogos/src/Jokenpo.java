import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jogador1;
        Random jogador2 = new Random();
        int pedra = 0;
        int tesoura = 1;
        int papel = 2;
        int pontos1 = 0;
        int pontos2 = 0;

        System.out.println("Informe a jogada:");
        System.out.println(" | 0 - Pedra   |");
        System.out.println(" | 1 - Tesoura |");
        System.out.println(" | 2 - Papel   |");
        jogador1 = sc.nextInt();

        while (pontos1 != 10 && pontos2 != 10) {
            switch (jogador1) {
                case 0:
                    System.out.print("PEDRA");
                    switch (jogador2.nextInt(2)) {
                        case 0:
                            System.out.println(" VS PEDRA");
                            System.out.println("----Empate!----");
                            break;
                        case 1:
                            System.out.println(" VS TESOURA");
                            System.out.println("----Pedra ganha de tesoura!----");
                            pontos1 += 1;
                            break;
                        case 2:
                            System.out.println(" VS PAPEL");
                            System.out.println("----Papel ganha de pedra!----");
                            pontos2 += 1;
                            break;
                    }
                    System.out.println("    | Pontuação jogador 1: " + pontos1 + " |");
                    System.out.println("    | Pontuação jogador 2: " + pontos2 + " |");
                    break;
                case 1:
                    System.out.print("TESOURA ");
                    switch (jogador2.nextInt(2)) {
                        case 0:
                            System.out.println("VS PEDRA");
                            System.out.println("----Pedra ganha de tesoura!----");
                            pontos2 += 1;
                            break;
                        case 1:
                            System.out.println("VS TESOURA");
                            System.out.println("----Empate!----");
                            break;
                        case 2:
                            System.out.println("VS PAPEL");
                            System.out.println("----Tesoura ganha de papel!----");
                            pontos1 += 1;
                            break;
                    }
                    System.out.println("    | Pontuação jogador 1: " + pontos1 + " |");
                    System.out.println("    | Pontuação jogador 2: " + pontos2 + " |");
                    break;
                case 2:
                    System.out.print("PAPEL ");
                    switch (jogador2.nextInt(2)) {
                        case 0:
                            System.out.println("VS PEDRA");
                            System.out.println("----Papel ganha de pedra!----");
                            pontos1 += 1;
                            break;
                        case 1:
                            System.out.println("VS TESOURA");
                            System.out.println("----Tesoura ganha de papel!----");
                            pontos2 += 1;
                            break;
                        case 2:
                            System.out.println("VS PAPEL");
                            System.out.println("----Empate!----");
                            break;
                    }
                    System.out.println("    | Pontuação jogador 1: " + pontos1 + " |");
                    System.out.println("    | Pontuação jogador 2: " + pontos2 + " |");
                    break;
            }
            jogador1 = sc.nextInt();
        }
        if (pontos1 == 10) {
            System.out.println("VOCÊ GANHOU!!");
        } else if (pontos2 == 10) {
            System.out.println("JOGADOR 2 GANHOU!!");
        }
    }
}