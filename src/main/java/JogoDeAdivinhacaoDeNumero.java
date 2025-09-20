import java.util.Random;
import java.util.Scanner;


public class JogoDeAdivinhacaoDeNumero {

    public static void main(String[] args) {

        Random geradorDeNumero = new Random();

        int numeroSecreto = geradorDeNumero.nextInt(100) + 1;

        Scanner leitor = new Scanner(System.in);

        int sugestaoDoJogador = 0;
        int tentativas =0;
        boolean acerto = false;

        System.out.println("Bem-vindo ao jogo de Adivinhção");
        System.out.println("foi escolhido um numero entre 1 e 100. agora tente adivinhar!");

        while (!acerto){

            System.out.print("Digite sua sugestão: ");
            sugestaoDoJogador = leitor.nextInt();

            if(sugestaoDoJogador == numeroSecreto) {

                acerto = true;
                System.out.println("Parabens! Você acertou" + numeroSecreto + "!");
                System.out.println("Você precisou de " + tentativas + "tentativas");


            }

            else  if (sugestaoDoJogador < numeroSecreto) {
                System.out.println("Passou longe! tente um número maior.");
            }
            else {
                System.out.println("Passou longe de mais! Vamos tentar um número menor");
            }


        }

        leitor.close();
        System.out.println("Fim de Jogo");

    }

}
