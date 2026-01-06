package syslogistica;

public class Navio extends Transporte{

    public Navio(String placa, double capacidadeMax) {
        super(placa, capacidadeMax);
    }

    @Override
    public double calcularFrete(double distancia, double peso) {
        return (distancia * 0.10) + (peso * 0.05);
    }
}
