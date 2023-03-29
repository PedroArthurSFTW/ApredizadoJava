/*
* codigo de projeto para capturarmos informaçãodo usuário para
* verificar a pessoa com maior idade e com maior altura entre ate 5 pessoa
* é utilizado vetores para receber os valores de "n" pessoas
* utilizado laço for para preencher cada espaço do vetor
*
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas vão ser avaliadas?: ");
        int quantity = sc.nextInt();

        while(quantity > 5){
            System.out.println("insira um valor valido (1 até 5): ");
            quantity = sc.nextInt();
        }

        double[] iddMax = new double[quantity];
        double[] altMax = new double[quantity];

        for(int i = 0; i < quantity; i++){
            System.out.println("altura da pessoa: ");
            altMax[i] = sc.nextDouble();
            System.out.println("idade da pessoa: ");
            iddMax[i] = sc.nextDouble();
        }


        double maiorIdd = iddMax[0];
        double maiorAlt = altMax[0];

        System.out.println("maior altura: " + decideAlt(maiorAlt, altMax));
        System.out.println("maior idade: "+ decideIdd(maiorIdd, iddMax));



        sc.close();
    }

    public static double decideIdd(double maiorIdd, double[] iddMax){

        for(int i = 0; i < 1; i++){
            if(maiorIdd <= iddMax[i]){
                maiorIdd = iddMax[i];
            }
        }
        return maiorIdd;
    }

    public static double decideAlt(double maiorAlt, double[] altMAx){
        for(int i = 0; i < 1; i++) {
            if (maiorAlt <= altMAx[i]) {
                maiorAlt = altMAx[i];
            }
        }
        return maiorAlt;
    }

}
