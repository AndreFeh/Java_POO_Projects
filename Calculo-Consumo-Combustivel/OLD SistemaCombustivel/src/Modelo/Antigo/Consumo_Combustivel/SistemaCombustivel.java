package Modelo.Antigo.Consumo_Combustivel;

import java.util.Scanner;

public class SistemaCombustivel {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double quilometragem;
        float valorCombustivel;
        float distanciaPercorrida;
        float capacidadeTanque;
        float gastoMedio;

        int prosseguir;
        do {
            System.out.println("Quantos KM o Carro Faz Por Litro");
            gastoMedio = scan.nextFloat();

            System.out.println("Quantos KM o Carro Vai Prosseguir");
            distanciaPercorrida = scan.nextFloat();

            System.out.println("Qual o Valor do Combustivel");
            valorCombustivel = scan.nextFloat();

            System.out.println("Qual a Capacidade Maxima do Tanque");
            capacidadeTanque = scan.nextFloat();

            System.out.println("Para onde vamos hoje 'o'");
            System.out.println("Digite (1) Para Calcular Quantos Reais o Carro Vai Gastar na Viagem");
            System.out.println("Digite (2) Para Calcular Quantos Litros Gastos Ate Checar ao Local");
            System.out.println("Digite (3) Para Calcular o Valor Total ao Encher o Tanque");
            System.out.println("Digite (4) Com Base na Capacidade Atual, Quanto Falta para Completar o Tanque");

            int opcao = scan.nextInt();


            switch (opcao) {
                case 1 -> { /*Calcular Quantos Reais o Carro Vai Gastar na Viagem*/
                    System.out.println("Voce Escolheu A Opção " + opcao);
                    double gastoComBaseNaDistancia = distanciaPercorrida / gastoMedio;
                    double total = gastoComBaseNaDistancia * valorCombustivel;
                    System.out.println("Um trajeto de " +distanciaPercorrida+" km"
                            + "\nÉ necessária uma quantia de R$ " + total +" para cumprir o trajeto");
                }
                case 2 -> { /*Quantos Litros Gastos Ate Checar ao Local*/
                    System.out.println("Voce Escolheu A Opção " + opcao);
                    double litrosComBaseNaDistancia = distanciaPercorrida / gastoMedio;
                    System.out.println("Para chegar ao destino, à " + distanciaPercorrida+ " quilômetros\nVocê consumirá "+litrosComBaseNaDistancia +" Litros");
                }
                case 3 -> { /*Calcular o Valor Para Encher o Tanque*/
                    System.out.println("Voce Escolheu A Opção " + opcao);
                    double total = capacidadeTanque * valorCombustivel;
                    System.out.println("Um tanque com a capacidade máxima de " + capacidadeTanque+ " Litros\nFica em torno de R$ " + total + " seu abastecimento completo");
                }
                case 4 -> { /*Quanto a porcentagem do tanque*/
                    System.out.println("Voce Escolheu A Opção " + opcao);
                    System.out.print("Qual a porcentagem de combustivel? ");
                    float valor = scan.nextFloat();
                    float porcentagem = valor / 100;
                    float restante = 100 - valor;

                    //                Calculo com base na capacidadeTanque, litros e  valor para completar
                    System.out.println("Para chegar a 100% é necessário preencher " + restante + "% do Tanque");

                    float litrosFaltantes = (capacidadeTanque - (porcentagem * capacidadeTanque));
                    float litrosRestantes = porcentagem*capacidadeTanque;
                    System.out.println("\nO tanque esta com aproximadamente " +litrosRestantes+" litros restantes, da capacidade máxima de " +capacidadeTanque+ " Litros");
                    System.out.println("\nPara completar o tanque são necessários " + litrosFaltantes + " Litros");

                    float valorParaCompletar = litrosFaltantes * valorCombustivel;
                    System.out.println("Valor total para completar, é de R$ " + valorParaCompletar);
                }
                default -> System.out.println("Opção Inválida");
            }

            System.out.println("Deseja Encerrar Essa Aplicação?\n1 - Sim \n2 - Não");
            prosseguir = scan.nextInt();
        } while (prosseguir != 1);
    }
}

