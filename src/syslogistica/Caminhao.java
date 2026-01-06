package syslogistica;

public class Caminhao extends Transporte implements Seguravel {

    public Caminhao(String placa, double capacidadeMax) {
        super(placa, capacidadeMax);
    }

    @Override
    public double calcularSeguro(double valorCarga) {
        return valorCarga * 0.02;
    }

    @Override
    public double calcularFrete(double distancia, double peso) {
        return (distancia * 0.5) + (peso * 0.10);
    }


}
