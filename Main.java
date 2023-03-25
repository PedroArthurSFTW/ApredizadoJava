import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * a função encontrar vai receber os valores do vetor e o numero que o usuario digitar
 * o laço for verifica array por array se algum bate com o digitado
 * se algum bater sera acrescentado um a variavel soma
 * se soma for diferente de zero no laço if na função main sera impresso o resulto "possui"
 * se nao "nao possui"
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = {2, 4, 6, 8};

        System.out.println("digite");
        int termo = sc.nextInt();

        if(encontrar(termo, vect) != 0){
            System.out.println("possui");
        }
        else{
            System.out.println("nao possui");
        }


        sc.close();

    }

    public static int encontrar (int termo, int[] vect){
        int soma = 0;
        for (int i =0; i <=3; i++){
            if(vect[i] == termo ){
                soma ++;
            }
        }


        return soma;
    }
}