package combustivel.consumo.contoller;

import combustivel.consumo.entity.CombustivelEntity;

public class CombustivelController {
    CombustivelEntity combustivel = new CombustivelEntity();

    public String valorGastoPorViagem(double distanciaPercorrida, float gastoMedio, float valorCobustivel) {
        double gastoComBaseDistancia = distanciaPercorrida / gastoMedio;
        double total = gastoComBaseDistancia * valorCobustivel;
        return "Um trajeto de  " + distanciaPercorrida + " km. É necessário uma quantia de R$ " + total + " para cumprir o trajeto";
    }

    public String consumoAteViagem(double distanciaPercorrida, float gastoMedio) {
        combustivel.setGastoMedio(gastoMedio);
        gastoMedio = combustivel.getGastoMedio();
        double litrosComBaseNaDistancia = distanciaPercorrida / gastoMedio;
        return "Para chegar ao destino, à " + distanciaPercorrida + " quilômetros\nVocê consumirá " + litrosComBaseNaDistancia + " Litros";
    }

    public String paraCompletarTanque(float capacidadeTanque, float porcentageEstimatida, float valorCobustivel) {
        combustivel.setCapacidadeTanque(capacidadeTanque);
        capacidadeTanque = combustivel.getCapacidadeTanque();
        double porcentagemConvertida = porcentageEstimatida / 100;
        double restanteCompletar = capacidadeTanque - porcentagemConvertida;
        // Calculo com base na capacidadeTanque, litros e  valor para completar
        double total = valorCobustivel * restanteCompletar;

        return "Um tanque com a capacidade máxima de " + capacidadeTanque + " Litros\nFica em torno de R$ " + total + " seu abastecimento completo\nCombustivel valor de R$ " + valorCobustivel;
    }
}
