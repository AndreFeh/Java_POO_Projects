package combustivel.consumo.entity;

public class CombustivelEntity {
    private double quilometragem;
    float capacidadeTanque;
    float gastoMedio;

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public float getGastoMedio() {
        return gastoMedio;
    }

    public void setGastoMedio(float gastoMedio) {
        this.gastoMedio = gastoMedio;
    }
}
