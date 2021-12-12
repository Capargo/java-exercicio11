import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Crie um programa que receba dois valores do usuário
        //e exiba a o resultado de sua multiplicação;

        Scanner scr = new Scanner(System.in);

        int valor;
        int valor1;
        int multiplicacao;

        System.out.print("informe o valor\n");
        valor = scr.nextInt();

        System.out.print("informe o valor1\n ");
        valor1 = scr.nextInt();

        System.out.print("o resultado da multiplicão é\n");

        multiplicacao =valor * valor1;

        System.out.println(multiplicacao);


    }
}
