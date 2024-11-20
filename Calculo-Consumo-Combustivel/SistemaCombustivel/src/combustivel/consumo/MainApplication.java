package combustivel.consumo;

import combustivel.consumo.contoller.CombustivelController;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        CombustivelController controller = new CombustivelController();
        Scanner scan = new Scanner(System.in);
        double distanciaPercorrida;
        float gastoMedio, capacidadeTanque, valorCombustivel, porcentagemEstimada;

        System.out.println("Para onde vamos hoje? ^u^");
        System.out.println(
                "Digite (1) Para Calcular Quantos Reais o Carro Vai Gastar na Viagem\n" +
                "Digite (2) Para Calcular Quantos Litros Gastos Ate Checar ao Local\n" +
                "Digite (3) Para Calcular o Valor Total ao Encher o Tanque\n" +
                "Digite (4) Com Base na Capacidade Atual, Quanto Falta para Completar o Tanque");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println(1);
                System.out.println(controller.consumoAteViagem(distanciaPercorrida = scan.nextDouble(), gastoMedio = scan.nextFloat()));
            }
            case 2 -> {
                System.out.println(2);
                System.out.println(controller.paraCompletarTanque(capacidadeTanque = scan.nextFloat(), porcentagemEstimada = scan.nextFloat(), valorCombustivel = scan.nextFloat()));
            }
            case 3 -> {
                System.out.println(3);
                System.out.println(controller.valorGastoPorViagem(distanciaPercorrida = scan.nextDouble(), gastoMedio = scan.nextFloat(), valorCombustivel = scan.nextFloat()));
            }
            default -> System.out.println("Opção Inválida");
        }
    }
}
